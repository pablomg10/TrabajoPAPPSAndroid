package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;
// AccommodationAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AccommodationAdapter extends RecyclerView.Adapter<AccommodationAdapter.AccommodationViewHolder> {

    private List<Alojamiento> listaAlojamientos;

    public AccommodationAdapter(List<Alojamiento> listaAlojamientos) {
        this.listaAlojamientos = listaAlojamientos;
    }

    @NonNull
    @Override
    public AccommodationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_accommodation, parent, false);
        return new AccommodationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccommodationViewHolder holder, int position) {
        Alojamiento alojamiento = listaAlojamientos.get(position);
        holder.bind(alojamiento);
    }

    @Override
    public int getItemCount() {
        return listaAlojamientos.size();
    }

    static class AccommodationViewHolder extends RecyclerView.ViewHolder {

        private TextView nombreAlojamiento;

        public AccommodationViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreAlojamiento = itemView.findViewById(R.id.accommodation_name);
        }

        public void bind(Alojamiento alojamiento) {
            nombreAlojamiento.setText(alojamiento.getNombre());
        }
    }
}
