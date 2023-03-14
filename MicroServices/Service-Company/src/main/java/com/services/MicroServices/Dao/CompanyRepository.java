package com.services.MicroServices.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.MicroServices.Entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
