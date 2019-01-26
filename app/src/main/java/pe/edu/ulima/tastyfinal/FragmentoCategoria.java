package pe.edu.ulima.tastyfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragmento que representa el contenido de cada pestaña dentro de la sección "Categorías"
 */
public class FragmentoCategoria extends Fragment {

    private static final String INDICE_SECCION
            = "pe.edu.ulima.FragmentoCategoriasTab.extra.INDICE_SECCION";

    private RecyclerView reciclador;
    private GridLayoutManager layoutManager;
    private AdaptadorCategorias adaptador;
    private FloatingActionButton floatingActionButton;

    public static FragmentoCategoria nuevaInstancia(int indiceSeccion) {
        FragmentoCategoria fragment = new FragmentoCategoria();
        Bundle args = new Bundle();
        args.putInt(INDICE_SECCION, indiceSeccion);
        fragment.setArguments(args);
        return fragment;


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_grupo_items, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        reciclador.setLayoutManager(layoutManager);


        int indiceSeccion = getArguments().getInt(INDICE_SECCION);

        switch (indiceSeccion) {
            case 0:
                adaptador = new AdaptadorCategorias(Comida.SANDWICHES);

                break;
            case 1:
                adaptador = new AdaptadorCategorias(Comida.VARIOS);
                break;
            case 2:
                adaptador = new AdaptadorCategorias(Comida.POSTRES);
                break;
        }

        adaptador.setOnItemClickListener(new AdaptadorCategorias.ClickListener() {
              @Override
                  public void onItemClick(int position, View v) {
                  Intent intent = new Intent(getActivity(), ReservarActivity.class);
                  startActivity(intent);
                     }//http://stackoverflow.com/questions/20835933/intent-from-fragment-to-activity
        });
                reciclador.setAdapter(adaptador);

        return view;
    }

}
