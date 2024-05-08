package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CityDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        // Obtener el nombre de la ciudad seleccionada del Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("cityName")) {
            String cityName = intent.getStringExtra("cityName");

            // Configurar RecyclerViews para mostrar los datos relevantes para la ciudad seleccionada
            RecyclerView restaurantRecyclerView = findViewById(R.id.restaurantRecyclerView);
            restaurantRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getRestaurantData(cityName));
            restaurantRecyclerView.setAdapter(restaurantAdapter);

            RecyclerView attractionRecyclerView = findViewById(R.id.attractionRecyclerView);
            attractionRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            AttractionAdapter attractionAdapter = new AttractionAdapter(getAttractionData(cityName));
            attractionRecyclerView.setAdapter(attractionAdapter);

            RecyclerView accommodationRecyclerView = findViewById(R.id.accommodationRecyclerView);
            accommodationRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            AccommodationAdapter accommodationAdapter = new AccommodationAdapter(getAccommodationData(cityName));
            accommodationRecyclerView.setAdapter(accommodationAdapter);
        }
    }

    // Métodos para obtener los datos relevantes para la ciudad seleccionada
    private List<Restaurante> getRestaurantData(String cityName) {
        // Implementa la lógica para obtener los datos de los restaurantes para la ciudad seleccionada
        // Retorna una lista de objetos Restaurante (Restaurant en inglés) para la ciudad dada
        List<Restaurante> restaurantes = new ArrayList<>();
        // Aquí puedes obtener datos de restaurantes para la ciudad específica usando cityName
        return restaurantes;
    }

    private List<SitioInteres> getAttractionData(String cityName) {
        // Implementa la lógica para obtener los datos de los sitios de interés para la ciudad seleccionada
        // Retorna una lista de objetos SitioInteres (Attraction en inglés) para la ciudad dada
        List<SitioInteres> sitiosInteres = new ArrayList<>();
        // Aquí puedes obtener datos de lugares de interés para la ciudad específica usando cityName
        return sitiosInteres;
    }

    private List<Alojamiento> getAccommodationData(String cityName) {
        // Implementa la lógica para obtener los datos de los alojamientos para la ciudad seleccionada
        // Retorna una lista de objetos Alojamiento (Accommodation en inglés) para la ciudad dada
        List<Alojamiento> alojamientos = new ArrayList<>();
        // Aquí puedes obtener datos de alojamientos para la ciudad específica usando cityName
        return alojamientos;
    }
}
