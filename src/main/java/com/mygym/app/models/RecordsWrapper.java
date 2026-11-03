package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record RecordsWrapper(List<Member> allMembers) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public RecordsWrapper {
        allMembers = allMembers != null ? allMembers : List.of();
    }

    public static RecordsWrapper empty() {
        return new RecordsWrapper(List.of());
    }
}
