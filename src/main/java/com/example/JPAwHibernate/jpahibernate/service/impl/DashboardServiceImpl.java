package com.example.JPAwHibernate.jpahibernate.service.impl;

import com.example.JPAwHibernate.jpahibernate.entity.*;
import com.example.JPAwHibernate.jpahibernate.repositories.*;
import com.example.JPAwHibernate.jpahibernate.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public EmployeeInformation addEmployeeInformation(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public boolean deleteEmployeeInformation(long employeeId) {
        EmployeeInformation employeeInformation = employeeInformationRepository.findByPk(employeeId);
        if (employeeInformation != null){
            employeeInformationRepository.delete(employeeInformation);
            return true;
        }
        return false;
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

}
