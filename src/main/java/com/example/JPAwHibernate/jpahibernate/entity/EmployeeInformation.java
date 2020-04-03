package com.example.JPAwHibernate.jpahibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
//@Table(name = "EmployeeInformation", schema = "sys")
public class EmployeeInformation extends KeyEntity{

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String position;

    @Getter
    @Setter
    private String officeLocation;

    @Getter
    @Setter
    private int age;

    @Getter
    @Setter
    private Date startDate;

    @Getter
    @Setter
    private double salary;
}
