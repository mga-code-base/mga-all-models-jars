package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.mygym.app.validation.OnCreate;

@Document(collection = "records")
@CompoundIndex(name = "member_date_idx", def = "{'memberId': 1, 'date': -1}")
public record MyRecord(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        @NotBlank(groups = OnCreate.class) String memberId,
        @NotBlank(groups = OnCreate.class) @Size(max = 100) String exerciseName,
        String targetMuscle,
        @NotEmpty(groups = OnCreate.class) List<@Valid WorkoutSet> sets,
        String date) implements Serializable {

    public MyRecord withMemberId(String memberId) {
        return new MyRecord(_id, memberId, exerciseName, targetMuscle, sets, date);
    }

    public MyRecord withTargetMuscle(String targetMuscle) {
        return new MyRecord(_id, memberId, exerciseName, targetMuscle, sets, date);
    }

    public MyRecord withDate(String date) {
        return new MyRecord(_id, memberId, exerciseName, targetMuscle, sets, date);
    }
}
