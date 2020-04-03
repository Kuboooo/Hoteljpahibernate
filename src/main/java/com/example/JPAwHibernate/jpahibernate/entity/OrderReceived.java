package com.example.JPAwHibernate.jpahibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "OrderReceived", schema = "sys")
public class OrderReceived extends KeyEntity{

    @Getter
    @Setter
    private int orderReceived;

    @Getter
    @Setter
    private String dateReceived;
}
