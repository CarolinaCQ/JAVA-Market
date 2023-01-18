package entity;

public class Cosmetic extends Product{

    private Double content;

    public Cosmetic() {
    }

    public Cosmetic(String name, Double price, Double content) {
        super(name, price);
        this.content = content;
    }

    public Double getContent() {
        return content;
    }

    public void setContent(Double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %d ml /// Precio: $%d", name, Math.round(content), Math.round(price));
    }
}
