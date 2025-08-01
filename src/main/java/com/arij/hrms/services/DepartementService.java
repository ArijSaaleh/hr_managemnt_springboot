package com.arij.hrms.services;

import com.arij.hrms.dto.DepartementDTO;
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
    public Departement findById(Long id) {
        return departementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departement not found"));
    }

    public Departement createDepartement(DepartementDTO dto) {
        Departement d = new Departement();
        d.setName(dto.getName());
        return departementRepository.save(d);
    }
    public Departement updateDepartement(Long id, DepartementDTO dto) {
        Departement d = findById(id);
        d.setName(dto.getName());
        return departementRepository.save(d);
    }
    public void deleteDepartement(Long id) {
        Departement d = findById(id);
        departementRepository.delete(d);
    }

}
