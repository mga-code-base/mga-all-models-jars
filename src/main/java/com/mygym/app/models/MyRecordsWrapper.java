package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record MyRecordsWrapper(List<MyRecord> allMyRecords) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public MyRecordsWrapper {
        allMyRecords = allMyRecords != null ? allMyRecords : List.of();
    }

    public static MyRecordsWrapper empty() {
        return new MyRecordsWrapper(List.of());
    }
}
