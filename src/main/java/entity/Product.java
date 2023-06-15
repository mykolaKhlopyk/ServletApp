package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private ProductType type;

    public Product(String name, int price, String description, ProductType type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

}
