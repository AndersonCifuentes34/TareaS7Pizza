package pkgPizza;

import java.util.ArrayList;

public class Topping {

    private String nombre;
    private double precio;

    public Topping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    private ArrayList<String> ingredientes = new ArrayList<>();

    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    //contructor

    public Topping(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString(){
        return "Topping{ nombre:"+nombre+" ingredientes:"+ingredientes + "Precio:" + precio;
    }

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}