package com.example.JPAwHibernate.jpahibernate.service;

import com.example.JPAwHibernate.jpahibernate.entity.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

public interface DashboardService {

    List<CompanyRevenueEntity> getCompanyRevenue(double revenue);
    List<CompanyRevenueEntity> getAllCompanyRevenues();

    List<ProductCategory> getBestCategoryProduct(boolean bestCategory);

    List<EmployeeInformation> getAllEmployeeInformation();
    List<OrderCollectionStatus> getAllOrderCollectionStatus();
    List<OrderReceived> getAllCompanyOrderReceived();
    List<ProductCategory> getAllProductCategory();

    EmployeeInformation addEmployeeInformation(EmployeeInformation employeeInformation);
    boolean deleteEmployeeInformation(long employeeId);
    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    public HashMap<String, Object> getTodayRevenueDash();
}
