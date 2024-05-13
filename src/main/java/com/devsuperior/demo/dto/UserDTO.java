package com.devsuperior.demo.dto;

import java.io.Serial;
import java.io.Serializable;

public record UserDTO(
        Long id,
        String name,
        String email,
        String password
) implements Serializable {

    @Serial
    private static final long serialVersionUID = 4875399753291672727L;
}
