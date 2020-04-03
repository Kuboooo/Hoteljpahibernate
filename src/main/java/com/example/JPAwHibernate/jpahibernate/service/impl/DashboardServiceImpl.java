package com.example.JPAwHibernate.jpahibernate.service.impl;

import com.example.JPAwHibernate.jpahibernate.entity.CompanyRevenueEntity;
import com.example.JPAwHibernate.jpahibernate.repositories.CompanyRevenueRepository;
import com.example.JPAwHibernate.jpahibernate.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CompanyRevenueRepository companyRevenueRepository;

    @Override
    public List<CompanyRevenueEntity> findAllByRevenue(double revenue) {
        return companyRevenueRepository.findCompanyRevenueEntityByRevenue(revenue);
    }

    @Override
    public List<CompanyRevenueEntity> findAll() {
        return companyRevenueRepository.findAll();
    }
}
