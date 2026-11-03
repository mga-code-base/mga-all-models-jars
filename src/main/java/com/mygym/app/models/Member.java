package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "members")
public record Member(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String memberId,
        String name,
        Long mobileNumber,
        String emailAddress,
        String membershipStartDate,
        String membershipEndDate,
        Boolean isPrivilegedMember,
        Integer localityPincode,
        String photo,
        String username,
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) String password,
        String trainerAssigned,
        String addedByAdminId,
        Boolean isActive,
        Boolean isFacialRegCompleted) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @PersistenceCreator
    @JsonCreator
    public Member {
        isActive = isActive != null ? isActive : Boolean.FALSE;
        isFacialRegCompleted = isFacialRegCompleted != null ? isFacialRegCompleted : Boolean.FALSE;
    }

    public static Member notFound() {
        return new Member(null, "-1", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public Member withMemberId(String memberId) {
        return new Member(_id, memberId, name, mobileNumber, emailAddress, membershipStartDate, membershipEndDate,
                isPrivilegedMember, localityPincode, photo, username, password, trainerAssigned, addedByAdminId,
                isActive, isFacialRegCompleted);
    }

    public Member withPassword(String password) {
        return new Member(_id, memberId, name, mobileNumber, emailAddress, membershipStartDate, membershipEndDate,
                isPrivilegedMember, localityPincode, photo, username, password, trainerAssigned, addedByAdminId,
                isActive, isFacialRegCompleted);
    }

    public Member withoutPassword() {
        return withPassword(null);
    }

    public Member withMembership(Boolean isActive, String membershipStartDate, String membershipEndDate) {
        return new Member(_id, memberId, name, mobileNumber, emailAddress, membershipStartDate, membershipEndDate,
                isPrivilegedMember, localityPincode, photo, username, password, trainerAssigned, addedByAdminId,
                isActive, isFacialRegCompleted);
    }

    public Member withTrainerAssigned(String trainerAssigned) {
        return new Member(_id, memberId, name, mobileNumber, emailAddress, membershipStartDate, membershipEndDate,
                isPrivilegedMember, localityPincode, photo, username, password, trainerAssigned, addedByAdminId,
                isActive, isFacialRegCompleted);
    }

    public Member withIsFacialRegCompleted(Boolean isFacialRegCompleted) {
        return new Member(_id, memberId, name, mobileNumber, emailAddress, membershipStartDate, membershipEndDate,
                isPrivilegedMember, localityPincode, photo, username, password, trainerAssigned, addedByAdminId,
                isActive, isFacialRegCompleted);
    }

    public Member withProfileFrom(Member source, String password) {
        return new Member(_id, memberId, source.name(), source.mobileNumber(), source.emailAddress(),
                source.membershipStartDate(), source.membershipEndDate(), source.isPrivilegedMember(),
                source.localityPincode(), source.photo(), source.username(), password, source.trainerAssigned(),
                source.addedByAdminId(), isActive, isFacialRegCompleted);
    }
}
