package com.example.JPAwHibernate.jpahibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "OrderCollectionStatus", schema = "sys")
public class OrderCollectionStatus extends KeyEntity{

    @Getter
    @Setter
    private int newOrders;

    @Getter
    @Setter
    private double revenue;

    @Getter
    @Setter
    private int shipped;

    @Getter
    @Setter
    private int returned;
}
