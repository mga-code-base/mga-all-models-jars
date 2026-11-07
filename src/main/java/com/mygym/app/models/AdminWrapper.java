package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record AdminWrapper(List<Admin> allAdmins) implements Serializable {

    public AdminWrapper {
        allAdmins = allAdmins != null ? allAdmins : List.of();
    }

    public static AdminWrapper empty() {
        return new AdminWrapper(List.of());
    }
}
