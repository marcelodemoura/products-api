package com.edu.curso.productsapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "tb_product")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID idProduct;
    private String name;
    private BigDecimal value;

}
