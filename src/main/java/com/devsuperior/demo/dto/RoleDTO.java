package com.devsuperior.demo.dto;

import java.io.Serial;
import java.io.Serializable;

public record RoleDTO(
        Long id,
        String authority
) implements Serializable {

    @Serial
    private static final long serialVersionUID = 2441266552015569833L;
}
