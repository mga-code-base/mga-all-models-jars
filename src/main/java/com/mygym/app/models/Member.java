package com.mygym.app.models;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.mygym.app.validation.OnCreate;

@Document(collection = "members")
public record Member(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        @Indexed(unique = true, sparse = true) String memberId,
        @NotBlank(groups = OnCreate.class) @Size(max = 100) String name,
        @Positive Long mobileNumber,
        @Email @Size(max = 254) String emailAddress,
        String membershipStartDate,
        String membershipEndDate,
        Boolean isPrivilegedMember,
        @Positive Integer localityPincode,
        String photo,
        @Indexed(unique = true, sparse = true) @NotBlank(groups = OnCreate.class) @Size(max = 64) String username,
        @NotBlank(groups = OnCreate.class) @Size(min = 8, max = 72, groups = OnCreate.class) String password,
        @Indexed(sparse = true) String trainerAssigned,
        String addedByAdminId,
        Boolean isActive,
        Boolean isFacialRegCompleted) implements Serializable {

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
