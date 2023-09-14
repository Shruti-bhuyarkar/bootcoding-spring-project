package com.employee.employee_app.service;

import com.employee.employee_app.model.Employee;
import com.employee.employee_app.repository.EmployeeRepository;
import com.employee.employee_app.utils.*;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    public String getNewEmp() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public List<String> getNewEmp(int noOfEmp){
        List<String> emp  = new ArrayList<>();
        for(int i = 0; i < noOfEmp; i++){
            String newEmp = getNewEmp();
           emp.add(newEmp);
        }
        return emp;
    }

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> generateNewEmp(int value) {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Employee emp = Employee.builder()
                    .name(NameGenerate.getName())
                    .emailId(EmailIdGenerator.generateEmail())
                    .position(PositionGenerator.getPosition())
                    .hireDate(HireDateGenerator.randomDate())
                    .salary(SalaryGenerator.getSalary(10000, 200000))
                    .build();
            list.add(emp);
            return employeeRepository.saveAll(list);
        }

        return list;
    }
}
