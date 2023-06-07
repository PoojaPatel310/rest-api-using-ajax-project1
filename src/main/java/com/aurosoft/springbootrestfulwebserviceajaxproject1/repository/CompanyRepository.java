package com.aurosoft.springbootrestfulwebserviceajaxproject1.repository;

import com.aurosoft.springbootrestfulwebserviceajaxproject1.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
