package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record MyRecordsWrapper(List<MyRecord> allMyRecords) implements Serializable {

    public MyRecordsWrapper {
        allMyRecords = allMyRecords != null ? allMyRecords : List.of();
    }

    public static MyRecordsWrapper empty() {
        return new MyRecordsWrapper(List.of());
    }
}
