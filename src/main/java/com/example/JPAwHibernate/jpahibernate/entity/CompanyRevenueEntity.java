package com.example.JPAwHibernate.jpahibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class CompanyRevenueEntity extends KeyEntity{

    private String _month;

    private double revenue;

    private double expense;

    private String margins;
}
