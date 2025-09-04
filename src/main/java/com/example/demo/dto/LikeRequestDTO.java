package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LikeRequestDTO {
    @NotBlank(message = "Target ID is required")
    private String targetId;

    @NotBlank(message = "Target Type is required")
    private String targetType; //
    // e.g., "question
    @NotNull(message = "Is like is required")// " or "answer"
    private boolean isLike;
}
