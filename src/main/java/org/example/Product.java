package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double cost;


    public Product() {
    }

    public Product(Long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

}
