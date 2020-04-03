package com.example.JPAwHibernate.jpahibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyRevenue", schema = "sys")
public class CompanyRevenueEntity extends KeyEntity{

    
    @Column(name = "Revenue_Month")
    private String _month;

    @Column(name = "revenue")
    private double revenue;

    @Column(name = "expense")
    private double expense;

    @Column(name = "margins")
    private String margins;
}
