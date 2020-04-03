package com.example.JPAwHibernate.jpahibernate.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "ProductCategory", schema = "sys")
public class ProductCategory extends KeyEntity{

    @Getter
    @Setter
    private String categoryName;

    @Getter
    @Setter
    private int percentage;

    @Getter
    @Setter
    private boolean bestCategory;
}
