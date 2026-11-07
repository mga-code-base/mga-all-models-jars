package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record BranchWrapper(List<Branch> allBranches) implements Serializable {

    public BranchWrapper {
        allBranches = allBranches != null ? allBranches : List.of();
    }

    public static BranchWrapper empty() {
        return new BranchWrapper(List.of());
    }
}
