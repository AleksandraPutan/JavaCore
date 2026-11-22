package lesson12.model;

import java.time.LocalDate;

import java.util.Objects;

public class Product {
    private int id;
    private  String name;
    private LocalDate manufactureDate;

    public Product(int id,String name, LocalDate manufactureDate) {
        this.id = id;
        this.name = name;
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + manufactureDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(manufactureDate, product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufactureDate);
    }
}
