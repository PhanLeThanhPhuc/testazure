package com.example.hocthem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @Basic(optional = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer amount;

    private Status status;

    @ManyToOne
    private Category category;

    public enum Status {
        HIDDEN, SHOW;
    }
}
