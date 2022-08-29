package com.csi.SpringBootJAPCRUD.dao;


import com.csi.SpringBootJAPCRUD.model.Employee;
import com.csi.SpringBootJAPCRUD.repository.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepositary employeeRepositaryImpl;

    public Employee saveData(Employee employee){
        return  employeeRepositaryImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepositaryImpl.findAll();
    }

    public Employee updateData(Employee employee){
        return  employeeRepositaryImpl.save(employee);
    }

    public void deleteData(int empId){
        employeeRepositaryImpl.deleteById(empId);
    }

    public List<Employee> getDataByName(String empFirstName){
        return employeeRepositaryImpl.findByEmpFirstName(empFirstName);
    }
}
