package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;

public record Failure(
        String reason,
        String updatedByAdmin,
        String updatedFailureDate,
        String estimatedDateOfFix) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
}
