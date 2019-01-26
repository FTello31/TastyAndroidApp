package pe.edu.ulima.tastyfinal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Johanna on 17/07/2016.
 */
public class Adaptador_vendedores
        extends RecyclerView.Adapter<Adaptador_vendedores.ViewHolder>  {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public TextView celular;
        public TextView email;
        public ImageView imagen;

        public ViewHolder(View vend) {
            super(vend);

            nombre = (TextView) vend.findViewById(R.id.nombre_vendedor);
            celular = (TextView) vend.findViewById(R.id.celular_vendedor);
            email = (TextView) vend.findViewById(R.id.email_vendedor);
            imagen=(ImageView)vend.findViewById(R.id.miniatura_fondo);
        }
    }


    public Adaptador_vendedores() {
    }

    @Override
    public Adaptador_vendedores.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View vend;
        vend = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_vendedor, parent, false);
        return new ViewHolder(vend);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Vendedor item = Vendedor.VENDEDORES.get(position);

        Glide.with(holder.itemView.getContext())
         .load(item.getIdImagen())
         .centerCrop()
            .into(holder.imagen)
        ;
        holder.nombre.setText(item.getNombre());
        holder.celular.setText("Celular: " + item.getCelular());
        holder.email.setText("Correo: " + item.getEmail());


    }

    @Override
    public int getItemCount() {
        return Vendedor.VENDEDORES.size();
    }
}
