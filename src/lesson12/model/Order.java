package lesson12.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private List<Product> products;
    private LocalDate orderDate;

    public Order(int id, List<Product> products, LocalDate orderDate) {
        this.id = id;
        this.products = products;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if(i == products.size()-1){
                str.append(product.toString());
                break;
            }
            str.append(product.toString()+"~");
        }
        return id + "/" + str +
                "/" + orderDate +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(products, order.products) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, orderDate);
    }
}
