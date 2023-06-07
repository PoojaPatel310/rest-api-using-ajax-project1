package com.aurosoft.springbootrestfulwebserviceajaxproject1.service.impl;

import com.aurosoft.springbootrestfulwebserviceajaxproject1.entity.Company;
import com.aurosoft.springbootrestfulwebserviceajaxproject1.repository.CompanyRepository;
import com.aurosoft.springbootrestfulwebserviceajaxproject1.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository repository;
    @Override
    public List<Company> listAllCompany() {
        return repository.findAll();
    }

    @Override
    public Company getCompanyById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Company insertCompany(Company company) {
        return repository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return repository.save(company);
    }

    @Override
    public int deleteCompany(int id) {
        repository.deleteById(id);
        return id;
    }
}
