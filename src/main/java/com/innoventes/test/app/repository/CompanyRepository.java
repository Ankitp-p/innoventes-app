package com.innoventes.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.test.app.entity.Company;
import org.springframework.data.jpa.repository.Query;


public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("SELECT c FROM company where c.id=?1")
    public Company getCompanyByID(long id);

    @Query("SELECT c FROM company where c.company_code=?1")
    public Company getCompanyByCompanyCode(String companyCode);
	
}