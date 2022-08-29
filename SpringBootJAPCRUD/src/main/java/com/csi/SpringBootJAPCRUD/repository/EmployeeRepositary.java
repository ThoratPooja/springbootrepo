package com.csi.SpringBootJAPCRUD.repository;

import com.csi.SpringBootJAPCRUD.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {

    //custom method goes here

    public List<Employee> findByEmpFirstName(String empFirstName);
}
