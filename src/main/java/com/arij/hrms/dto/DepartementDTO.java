package com.arij.hrms.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartementDTO {
    private Long id;
    @NotBlank
    private String name;
}
