package pe.edu.ulima.tastyfinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Comida(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> OfertasDelDia = new ArrayList<Comida>();
    public static final List<Comida> VARIOS = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> SANDWICHES = new ArrayList<>();

    static {
        OfertasDelDia.add(new Comida(4, "Cupcakes Fiesta - 4 unid", R.drawable.acupcakes1oferta));
        OfertasDelDia.add(new Comida(3.5f, "Torta Kit kat", R.drawable.atortakitkat));
        OfertasDelDia.add(new Comida(5, "Croissant + Cafe", R.drawable.acroissantcafe));
        OfertasDelDia.add(new Comida(3.50f, "Avena Chips - 4 unid", R.drawable.aavenachip));
        OfertasDelDia.add(new Comida(6, "Club Sandwich", R.drawable.aclubsandwich));

        SANDWICHES.add(new Comida(2, "Sandwich con jamon", R.drawable.asandwichjamon));
        SANDWICHES.add(new Comida(3.5f, "Croissant de chocolate", R.drawable.acroissantchocolate));
        SANDWICHES.add(new Comida(2.5f, "Croissant jamon y queso", R.drawable.acroissantjamon));
        SANDWICHES.add(new Comida(3.8f, "Sandwich de lomo saltado", R.drawable.alomosaltado));
        SANDWICHES.add(new Comida(3.5f, "Sandwich de hamburguesa", R.drawable.ahamburguesa));

        VARIOS.add(new Comida(15.5f, "Cable USB", R.drawable.acabledatos));
        VARIOS.add(new Comida(45.0f, "Audifonos", R.drawable.aaudifono));
        VARIOS.add(new Comida(25.0f, "Case para iphone", R.drawable.acaseiphone));
        VARIOS.add(new Comida(24, "Cuadernos personalizados", R.drawable.acuaderno));
        VARIOS.add(new Comida(18.0f, "Chockers", R.drawable.achocker));

        POSTRES.add(new Comida(2, "Postre De Vainilla", R.drawable.apostrevainilla));
        POSTRES.add(new Comida(3, "Flan Celestial", R.drawable.aflancelestial));
        POSTRES.add(new Comida(2.5f, "Cupcake Festival", R.drawable.acupcakesfestival));
        POSTRES.add(new Comida(4, "Pastel De Fresa", R.drawable.apastelfresa));
        POSTRES.add(new Comida(5, "Muffin Amoroso", R.drawable.amuffinamoroso));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
