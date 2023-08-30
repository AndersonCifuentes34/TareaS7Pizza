package pkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private  double price;
    private List<Topping> toopings = new ArrayList<>();


    //constructor

    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping topping : toppings) {
            this.toopings.add(topping);
        }
    }

    public void addTopping(Topping tooping){
        this.toopings.add(tooping);
    }


    public void removeTopping(int index){
        this.toopings.remove(index);
    }


    @Override
    public String toString(){
        return "Pizza:"+name+" Price="+price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToopings() {
        return toopings;
    }

    public void setToopings(List<Topping> toopings) {
        this.toopings = toopings;
    }

    private double calculateTotalPrice() {
        double totalPrice = price;
        for (Topping topping : toopings) {
            totalPrice += topping.getPrecio();
        }
        return totalPrice;
    }
    public void prepare() {
        System.out.println("Preparando la pizza.. " + name);
        System.out.println("Agregando Ingredientes...");

        // Calculate the maximum length of ingredient name
        int maxNameLength = 0;
        for (Topping topping : toopings) {
            if (topping.getNombre().length() > maxNameLength) {
                maxNameLength = topping.getNombre().length();
            }
        }

        for (Topping topping : toopings) {
            String ingredientLine = String.format("%-" + (maxNameLength + 1) + "s Q.%.2f", topping.getNombre(), topping.getPrecio());
            System.out.println(ingredientLine);

            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.printf(ex.getMessage());
            }
        }

        System.out.println("Precio total:     Q." + calculateTotalPrice());
    }
}
