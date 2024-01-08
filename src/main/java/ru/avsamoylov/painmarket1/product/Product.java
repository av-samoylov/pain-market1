package ru.avsamoylov.painmarket1.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Product {
    private Long id;
    private String name;
    private float price;

    public Product(Long id, String name, float price) {
        this.id = id;
        this.name = name;
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less than or equal to zero");
        }
        this.price = price;
    }
}
