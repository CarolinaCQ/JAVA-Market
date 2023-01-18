package entity;

public class Fruit extends Product{

    private String sellUnit;

    public Fruit() {
    }

    public Fruit(String name, Double price, String sellUnit) {
        super(name, price);
        this.sellUnit = sellUnit;
    }

    public String getSellUnit() {
        return sellUnit;
    }

    public void setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: $%d /// Unidad de venta: %s", name, Math.round(price), sellUnit);
    }
}
