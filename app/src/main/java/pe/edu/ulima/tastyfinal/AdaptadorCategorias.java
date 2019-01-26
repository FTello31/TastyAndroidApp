package pe.edu.ulima.tastyfinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdaptadorCategorias
        extends RecyclerView.Adapter<AdaptadorCategorias.ViewHolder>  {

    private static ClickListener clickListener;
    private final List<Comida> items;

// http://stackoverflow.com/questions/24471109/recyclerview-onclick

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // Campos respectivos de un item
        public TextView nombre;
        public TextView precio;
        public ImageView imagen;
private String mItem;


        public ViewHolder(View v) {
            super(v);
v.setOnClickListener(this);
            nombre = (TextView) v.findViewById(R.id.nombre_comida);
            precio = (TextView) v.findViewById(R.id.precio_comida);
            imagen = (ImageView) v.findViewById(R.id.miniatura_comida);
        }
        public void setItem(String item) {
            mItem = item;

        }


        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(), view);
         }
        }

    public interface ClickListener {
        void onItemClick(int position, View v);

    }

    public void setOnItemClickListener(ClickListener clickListener) {
        AdaptadorCategorias.clickListener = clickListener;
    }

    public AdaptadorCategorias(List<Comida> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_categorias, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Comida item = items.get(i);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(viewHolder.imagen);
        viewHolder.nombre.setText(item.getNombre());
        viewHolder.precio.setText("S/." + item.getPrecio());

    }


}