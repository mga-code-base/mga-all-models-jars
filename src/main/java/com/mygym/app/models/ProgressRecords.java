package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record ProgressRecords(
        List<MyRecord> chestRecords,
        List<MyRecord> shoulderRecords,
        List<MyRecord> backRecords,
        List<MyRecord> bicepRecords,
        List<MyRecord> tricepRecords,
        List<MyRecord> legRecords,
        List<MyRecord> absRecords,
        List<MyRecord> cardioRecords) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
}
