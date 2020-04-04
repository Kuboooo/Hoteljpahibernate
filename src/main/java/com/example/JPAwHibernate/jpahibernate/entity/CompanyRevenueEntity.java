package com.example.JPAwHibernate.jpahibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class CompanyRevenueEntity extends KeyEntity{

    @Getter
    @Setter
    private String _month;

    @Getter
    @Setter
    private double revenue;

    @Getter
    @Setter
    private double expense;

    @Getter
    @Setter
    private double margins;
}
