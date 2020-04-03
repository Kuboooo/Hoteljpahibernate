package com.example.JPAwHibernate.jpahibernate.repositories;

import com.example.JPAwHibernate.jpahibernate.entity.CompanyRevenueEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "CompanyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenueEntity, Long> {

    List<CompanyRevenueEntity> findCompanyRevenueEntityByRevenue(double revenue);
    List<CompanyRevenueEntity> findAll();



}
