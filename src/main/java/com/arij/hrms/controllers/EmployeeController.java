package com.arij.hrms.controllers;


import com.arij.hrms.dto.EmployeeDTO;
import com.arij.hrms.entities.Employee;
import com.arij.hrms.services.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @PostMapping
    public Employee create(@Valid @RequestBody EmployeeDTO DTO){
        return employeeService.create(DTO);
    }
}
