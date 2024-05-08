package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    private List<City> cities;
    private List<City> filteredCities; // Nueva lista para almacenar las ciudades filtradas
    private Context context;

    public CityAdapter(Context context, List<City> cities) {
        this.context = context;
        this.cities = cities;
        this.filteredCities = new ArrayList<>(cities); // Inicializa la lista de ciudades filtradas
    }

    // Método para establecer la lista de ciudades filtradas
    public void setFilteredCities(List<City> filteredCities) {
        this.filteredCities = filteredCities;
        notifyDataSetChanged(); // Notifica al adaptador que los datos han cambiado
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        City city = filteredCities.get(position); // Usamos la lista de ciudades filtradas
        holder.bind(city);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtén la ciudad seleccionada
                String cityName = city.getName();

                // Crea un Intent para abrir la actividad CityDetailsActivity
                Intent intent = new Intent(context, CityDetailsActivity.class);
                intent.putExtra("cityName", cityName);

                // Inicia la actividad
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return filteredCities.size(); // Usamos la lista de ciudades filtradas
    }

    static class CityViewHolder extends RecyclerView.ViewHolder {

        private TextView cityNameTextView;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            cityNameTextView = itemView.findViewById(R.id.city_name);
        }

        public void bind(City city) {
            cityNameTextView.setText(city.getName());
        }
    }
}
