package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record MemberWrapper(List<Member> allMembers) implements Serializable {

    public MemberWrapper {
        allMembers = allMembers != null ? allMembers : List.of();
    }

    public static MemberWrapper empty() {
        return new MemberWrapper(List.of());
    }
}
