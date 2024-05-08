package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private List<Restaurante> listaRestaurantes;

    public RestaurantAdapter(List<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurante restaurante = listaRestaurantes.get(position);
        holder.bind(restaurante);
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        private TextView nombreRestaurante;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreRestaurante = itemView.findViewById(R.id.restaurant_name);
        }

        public void bind(Restaurante restaurante) {
            nombreRestaurante.setText(restaurante.getNombre());
        }
    }
}
