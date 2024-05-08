package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {

    private List<SitioInteres> listaSitiosInteres;

    public AttractionAdapter(List<SitioInteres> listaSitiosInteres) {
        this.listaSitiosInteres = listaSitiosInteres;
    }

    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_attraction, parent, false);
        return new AttractionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionViewHolder holder, int position) {
        SitioInteres sitioInteres = listaSitiosInteres.get(position);
        holder.bind(sitioInteres);
    }

    @Override
    public int getItemCount() {
        return listaSitiosInteres.size();
    }

    static class AttractionViewHolder extends RecyclerView.ViewHolder {

        private TextView attractionName;

        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
            attractionName = itemView.findViewById(R.id.attraction_name);
        }

        public void bind(SitioInteres sitioInteres) {
            attractionName.setText(sitioInteres.getNombre());
        }
    }
}
