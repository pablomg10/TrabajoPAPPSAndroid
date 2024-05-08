package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<City> cityList = new ArrayList<>();
    private CityAdapter adapter;
    private EditText searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar la lista de ciudades
        initCityList();

        // Configurar RecyclerView para las ciudades
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CityAdapter(this, cityList);
        recyclerView.setAdapter(adapter);

        // Configurar la barra de búsqueda
        searchView = findViewById(R.id.searchView);
        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Filtrar la lista de ciudades basándose en el texto de búsqueda
                List<City> filteredCities = filterCities(s.toString());
                adapter.setFilteredCities(filteredCities); // Actualiza la lista de ciudades filtradas en el adaptador
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void initCityList() {
        Resources res = getResources();
        String[] cityNames = res.getStringArray(R.array.city_names);

        for (String name : cityNames) {
            cityList.add(new City(name));
        }
    }

    private List<City> filterCities(String searchText) {
        List<City> filteredCities = new ArrayList<>();
        for (City city : cityList) {
            if (city.getName().toLowerCase().contains(searchText.toLowerCase())) {
                filteredCities.add(city);
            }
        }
        return filteredCities;
    }
}
