package entity;

public class Beverage extends Product{

    private Double liters;

    public Beverage() {
    }

    public Beverage(Double liters, String name, Double price) {
        super(name, price);
        this.liters = liters;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %.1f /// Precio: $%d", name, liters, Math.round(price));
    }
}
