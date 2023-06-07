package com.aurosoft.springbootrestfulwebserviceajaxproject1.service;

import com.aurosoft.springbootrestfulwebserviceajaxproject1.entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> listAllCompany();

    Company getCompanyById(int id);

    Company insertCompany(Company company);

    Company updateCompany(Company company);

    int deleteCompany(int id);


}
