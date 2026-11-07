package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "records")
public record MyRecord(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String memberId,
        String exerciseName,
        String targetMuscle,
        List<WorkoutSet> sets,
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
