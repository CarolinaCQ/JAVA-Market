package service;

import entity.Cosmetic;
import entity.Beverage;
import entity.Fruit;
import entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {

    public List<Product> dataLoad (){

        List<Product> products = new ArrayList<>();

        Beverage cocaColaZero = new Beverage();
        cocaColaZero.setName("Coca-Cola Zero");
        cocaColaZero.setPrice(20.0);
        cocaColaZero.setLiters(1.5);
        products.add(cocaColaZero);

        Beverage cocaCola = new Beverage();
        cocaCola.setName("Coca-Cola");
        cocaCola.setPrice(18.0);
        cocaCola.setLiters(1.5);
        products.add(cocaCola);

        Cosmetic shampooSedal = new Cosmetic();
        shampooSedal.setName("Shampoo Sedal");
        shampooSedal.setPrice(19.0);
        shampooSedal.setContent(500.0);
        products.add(shampooSedal);

        Fruit strawberries = new Fruit();
        strawberries.setName("Frutillas");
        strawberries.setPrice(64.0);
        strawberries.setSellUnit("kilo");
        products.add(strawberries);

        return products;
    }

    private String cheaperProduct(){
        List<Product> products = this.dataLoad();
        Collections.sort(products);

        return products.get(0).getName();
    }

    private String mostExpensiveProduct(){
        List<Product> products = this.dataLoad();
        Collections.sort(products, Collections.reverseOrder());

        return products.get(0).getName();
    }


    public void view(){
        List<Product> products = this.dataLoad();

        products.forEach((product) -> System.out.println(product));
        System.out.println("=============================");
        System.out.printf("Producto más caro: %s", this.mostExpensiveProduct()).println();
        System.out.printf("Producto más barato: %s", this.cheaperProduct());
    }
}
