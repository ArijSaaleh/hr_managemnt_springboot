package com.arij.hrms.services;


import com.arij.hrms.dto.EmployeeDTO;
import com.arij.hrms.entities.Departement;
import com.arij.hrms.entities.Employee;
import com.arij.hrms.repositories.DepartementRepository;
import com.arij.hrms.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final DepartementRepository departementRepository;
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Employee create(EmployeeDTO dto) {
        Departement dept = departementRepository.findById(dto.getDepartmentId()).orElseThrow(() -> new RuntimeException("Departement not found"));
        Employee emp = Employee.builder().firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .departement(dept)
                .build();
        return employeeRepository.save(emp);

    }
    public Employee update(Long id, EmployeeDTO dto) {
        Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        Departement dept = departementRepository.findById(dto.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Departement not found"));

        emp.setFirstName(dto.getFirstName());
        emp.setLastName(dto.getLastName());
        emp.setEmail(dto.getEmail());
        emp.setDepartement(dept);

        return employeeRepository.save(emp);
    }

    public void delete(Long id){
        employeeRepository.deleteById(id);
    }

}
