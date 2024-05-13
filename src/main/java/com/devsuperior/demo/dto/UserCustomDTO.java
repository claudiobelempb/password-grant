package com.devsuperior.demo.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record UserCustomDTO(
        Long id,
        String name,
        String email,
        String password,
        List<RoleDTO> roles
) implements Serializable {

    @Serial
    private static final long serialVersionUID = 4875399753291672727L;
}
