package com.example.JPAwHibernate.jpahibernate.service.impl;

import com.example.JPAwHibernate.jpahibernate.entity.*;
import com.example.JPAwHibernate.jpahibernate.repositories.*;
import com.example.JPAwHibernate.jpahibernate.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CompanyRevenueRepository companyRevenueRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    @Autowired
    private OrderCollectionStatusRepository orderCollectionStatusRepository;

    @Autowired
    private OrderReceivedRepository orderReceivedRepository;

    @Override
    public List<CompanyRevenueEntity> getCompanyRevenue(double revenue) {
        return companyRevenueRepository.findCompanyRevenueEntityByRevenue(revenue);
    }

    @Override
    public List<CompanyRevenueEntity> getAllCompanyRevenues() {
        return companyRevenueRepository.findAll();
    }

    @Override
    public List<ProductCategory> getBestCategoryProduct(boolean bestCategory) {
        return productCategoryRepository.findByBestCategory(bestCategory);
    }

    @Override
    public List<EmployeeInformation> getAllEmployeeInformation() {
        return employeeInformationRepository.findAll();
    }

    @Override
    public List<OrderCollectionStatus> getAllOrderCollectionStatus() {
        return orderCollectionStatusRepository.findAll();
    }

    @Override
    public List<OrderReceived> getAllCompanyOrderReceived() {
        return orderReceivedRepository.findAll();
    }

    @Override
    public List<ProductCategory> getAllProductCategory() {
        return productCategoryRepository.findAll();
    }

    @Override
    public void addEmployeeInformation(EmployeeInformation employeeInformation) {
        employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public void deleteEmployeeInformation(EmployeeInformation employeeInformation) {
        employeeInformationRepository.delete(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

}
