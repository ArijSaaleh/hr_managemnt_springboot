package com.arij.hrms.services;

import com.arij.hrms.entities.Departement;
import com.arij.hrms.repositories.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartementService {
    private final DepartementRepository departementRepository;

    public List<Departement> findAll() {
        return departementRepository.findAll();
    }

    public Departement createDepartement(Departement dept) {
        return departementRepository.save(dept);
    }
}
