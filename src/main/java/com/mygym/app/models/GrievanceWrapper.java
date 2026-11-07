package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record GrievanceWrapper(List<Grievance> allGrievances) implements Serializable {

    public GrievanceWrapper {
        allGrievances = allGrievances != null ? allGrievances : List.of();
    }

    public static GrievanceWrapper empty() {
        return new GrievanceWrapper(List.of());
    }
}
