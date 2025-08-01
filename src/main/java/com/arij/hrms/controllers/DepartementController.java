package com.arij.hrms.controllers;


import com.arij.hrms.entities.Departement;
import com.arij.hrms.services.DepartementService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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

    @PostMapping
    public Departement createDepartement(@Valid @RequestBody  Departement dept) {
        return departementService.createDepartement(dept);
    }

}
