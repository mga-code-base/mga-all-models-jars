package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record GrievanceWrapper(List<Grievance> allGrievances) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public GrievanceWrapper {
        allGrievances = allGrievances != null ? allGrievances : List.of();
    }

    public static GrievanceWrapper empty() {
        return new GrievanceWrapper(List.of());
    }
}
