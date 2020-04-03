package com.example.JPAwHibernate.jpahibernate.service;

import com.example.JPAwHibernate.jpahibernate.entity.*;

import java.util.List;

public interface DashboardService {

    List<CompanyRevenueEntity> getCompanyRevenue(double revenue);
    List<CompanyRevenueEntity> getAllCompanyRevenues();

    List<ProductCategory> getBestCategoryProduct(boolean bestCategory);

    List<EmployeeInformation> getAllEmployeeInformation();
    List<OrderCollectionStatus> getAllOrderCollectionStatus();
    List<OrderReceived> getAllCompanyOrderReceived();
    List<ProductCategory> getAllProductCategory();

    void addEmployeeInformation(EmployeeInformation employeeInformation);
    void deleteEmployeeInformation(EmployeeInformation employeeInformation);
    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
}
