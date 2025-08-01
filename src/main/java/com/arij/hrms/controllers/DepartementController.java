package com.arij.hrms.controllers;


import com.arij.hrms.dto.DepartementDTO;
import com.arij.hrms.entities.Departement;
import com.arij.hrms.services.DepartementService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
@RequiredArgsConstructor
public class DepartementController {

    private final DepartementService departementService;

    @GetMapping
    public List<Departement> getAll(){
        return departementService.findAll();
    }

    @GetMapping("/{id}")
    public Departement getById(@PathVariable Long id) {
        return departementService.findById(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Departement create(@Valid @RequestBody DepartementDTO dto) {
        return departementService.createDepartement(dto);
    }
    @PutMapping("/{id}")
    public Departement update(@PathVariable Long id, @Valid @RequestBody DepartementDTO dto) {
        return departementService.updateDepartement(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departementService.deleteDepartement(id);
    }
}
