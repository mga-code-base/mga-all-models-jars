package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record BranchWrapper(List<Branch> allBranches) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public BranchWrapper {
        allBranches = allBranches != null ? allBranches : List.of();
    }

    public static BranchWrapper empty() {
        return new BranchWrapper(List.of());
    }
}
