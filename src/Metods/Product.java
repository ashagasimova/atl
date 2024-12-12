package Metods;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String category;
    private int Id;

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

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Id == product.Id && Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }


    public Product(String name, double price, String category, int Id) {
        this.name = name;
        this.price = price;
        this.category = category;


    }
}
