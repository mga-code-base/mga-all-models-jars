package com.mygym.app.models;

import java.io.Serializable;

public record Failure(
        String reason,
        String updatedByAdmin,
        String updatedFailureDate,
        String estimatedDateOfFix) implements Serializable {
}
