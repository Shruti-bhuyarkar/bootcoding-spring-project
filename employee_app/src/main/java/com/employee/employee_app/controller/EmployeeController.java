package com.employee.employee_app.controller;

import com.employee.employee_app.model.Employee;
import com.employee.employee_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("emp/{name}")
    public String getEmpObjectById(@PathVariable("name") String EmployeeName){
        return employeeService.getNewEmp();
    }

    @GetMapping("all-emp")
    public List<String> getAllEmp(){
        int noOfEmp = 10;
        return employeeService.getNewEmp(noOfEmp);
    }

    @PostMapping("/EmpDetails/{value}")
    public  List<Employee> generateNewEmp(@PathVariable int value){
        return employeeService.generateNewEmp(value);
    }
}
