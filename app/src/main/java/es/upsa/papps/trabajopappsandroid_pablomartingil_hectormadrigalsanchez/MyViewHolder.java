package es.upsa.papps.trabajopappsandroid_pablomartingil_hectormadrigalsanchez;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

ImageView imageView;
TextView nombreView, provinciaView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageView);
        nombreView= itemView.findViewById(R.id.nombre);
        provinciaView=itemView.findViewById(R.id.provincia);
    }
}
