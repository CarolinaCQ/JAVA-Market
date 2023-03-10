package entity;

public class Product implements Comparable<Product>{

    protected String name;
    protected Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        if (this.getPrice()>p.getPrice()) {
            return 1;
        }else if (this.getPrice()<p.getPrice()) {
            return -1;
        }else {
            return 0;
        }
    }

}
