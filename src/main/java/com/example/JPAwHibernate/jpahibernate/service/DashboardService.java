package com.example.JPAwHibernate.jpahibernate.service;

import com.example.JPAwHibernate.jpahibernate.entity.CompanyRevenueEntity;

import java.util.List;

public interface DashboardService {

    List<CompanyRevenueEntity> findAllByRevenue(double revenue);
    List<CompanyRevenueEntity> findAll();
}
