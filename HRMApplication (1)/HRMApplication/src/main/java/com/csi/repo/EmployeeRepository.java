package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findByEmpContactNumber(long empContactNumber);

    public Employee findByEmpEmailId(String empMailId);










}
