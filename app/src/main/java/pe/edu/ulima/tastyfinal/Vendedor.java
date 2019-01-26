package pe.edu.ulima.tastyfinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johanna on 17/07/2016.
 */
public class Vendedor {

    private String nombre;
    private long celular;
    private String email;
    private int idImagen;

    public Vendedor(String nombre, long celular, String email, int idImagen) {
        this.nombre = nombre;
        this.celular = celular;
        this.email = email;
        this.idImagen=idImagen;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final List<Vendedor> VENDEDORES =new ArrayList<>();

    static {
        VENDEDORES.add(new Vendedor( "Johanna",998199011,"Johanna@hotmail.com", R.drawable.imagen1));
        VENDEDORES.add(new Vendedor( "Fernando",998199011,"Fernando@hotmail.com",R.drawable.imagen2));
        VENDEDORES.add(new Vendedor( "Diego",998199011,"Diego@hotmail.com",R.drawable.imagen4));
        VENDEDORES.add(new Vendedor( "Giuliana",998199011,"Giuliana@hotmail.com",R.drawable.imagen5));
        VENDEDORES.add(new Vendedor( "Gabriela",998199011,"Gabriela@hotmail.com",R.drawable.imagen1));
        VENDEDORES.add(new Vendedor( "Mariana",998199011,"Mariana@hotmail.com",R.drawable.imagen2));
        VENDEDORES.add(new Vendedor( "Jhonatan",998199011,"Jhonatan@hotmail.com",R.drawable.imagen4));
        VENDEDORES.add(new Vendedor( "Rolando",998199011,"Rolando@hotmail.com",R.drawable.imagen5));
    }







}
