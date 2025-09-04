package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "likes")
public class Like {
    @Id
    private String id;

    private String targetId;

    //Add ENUM For Target Type
    private String targetType; //Question, Answer

    private boolean isLike;

    @CreatedDate
    private LocalDateTime createdAt;
}
