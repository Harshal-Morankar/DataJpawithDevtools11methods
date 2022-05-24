package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employyeeDaoImpl;

    public Employee signUp(Employee employee){
        return employyeeDaoImpl.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword){
        return employyeeDaoImpl.signIn(empEmailId, empPassword);

    }

    public List<Employee> saveBulOfData(List<Employee> employees){
        return employyeeDaoImpl.saveBulOfData(employees);
    }

    public Optional<Employee> getDataById(int empId){
        return employyeeDaoImpl.getDataById(empId);
    }

    public Employee getDatByEmail(String empEmailId){
        return employyeeDaoImpl.getDatByEmail(empEmailId);
    }

    public Employee getDataByContactNumber(long empContactNumber){
        return employyeeDaoImpl.getDataByContactNumber(empContactNumber);
    }

    public List<Employee> filterDataBySalary(double empSalary){

        return employyeeDaoImpl.filterDataBySalary(empSalary);
    }

    public List<Employee> getAllData(){
        return employyeeDaoImpl.getAllData();
    }

    public Employee updateData(Employee employee){
        return employyeeDaoImpl.updateData(employee);
    }

    public void deleteDataById(int empId){
        employyeeDaoImpl.deleteDataById(empId);
    }

    public void deleteAllData(){
        employyeeDaoImpl.deleteAllData();
    }
}
