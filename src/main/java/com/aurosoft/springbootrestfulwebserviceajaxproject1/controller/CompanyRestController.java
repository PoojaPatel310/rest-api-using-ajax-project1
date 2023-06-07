package com.aurosoft.springbootrestfulwebserviceajaxproject1.controller;

import com.aurosoft.springbootrestfulwebserviceajaxproject1.entity.Company;
import com.aurosoft.springbootrestfulwebserviceajaxproject1.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CompanyRestController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("/companyList")
    public ResponseEntity<List<Company>> getCompanyList(){
        return new ResponseEntity<List<Company>>(companyService.listAllCompany(), HttpStatus.OK);
    }
    @GetMapping("/company/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable int id){
        return new ResponseEntity<Company>(companyService.getCompanyById(id),HttpStatus.OK);
    }

    @PostMapping("/company/save")
    public ResponseEntity<Company> insertCompany(@RequestBody Company company){
        companyService.insertCompany(company);
        return new ResponseEntity<Company>(HttpStatus.OK);
    }

    @PutMapping("/company/update")
    public ResponseEntity<Company> updateCompany(@RequestBody Company company){
        companyService.updateCompany(company);
        return new ResponseEntity<Company>(HttpStatus.OK);
    }

    @DeleteMapping("/company/delete/{id}")
    public ResponseEntity<Company> deleteCompany(@PathVariable int id){
        companyService.deleteCompany(id);
        return new ResponseEntity<Company>(HttpStatus.OK);
    }
}
