package com.example.JPAwHibernate.jpahibernate.controller;

import com.example.JPAwHibernate.jpahibernate.entity.EmployeeInformation;
import com.example.JPAwHibernate.jpahibernate.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEndpointController {

    @Autowired
    DashboardService dashboardService;

    @RequestMapping("/employees")
    public List<EmployeeInformation> getAllEmployees(){
       return dashboardService.getAllEmployeeInformation();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees/add")
    public String saveEmployee(@RequestBody EmployeeInformation employeeInformation){
        if (dashboardService.addEmployeeInformation(employeeInformation) != null){
            return "Employee successfully saved";
        }else {
            return "Error saving employee";
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "employees/delete")
    public String deleteEmployee(@RequestParam(name="employeeId", required = true) String employeeId){
        long employeePK = Long.parseLong(employeeId);
        if (dashboardService.deleteEmployeeInformation(employeePK)){
            return "Employee deleted";
        } else {
            return "Employee deletion failed";
        }
    }
}
