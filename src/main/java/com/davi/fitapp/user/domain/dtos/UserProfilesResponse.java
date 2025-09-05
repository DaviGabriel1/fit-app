package com.davi.fitapp.user.domain.dtos;

import com.davi.fitapp.user.domain.enums.ActivityLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record UserProfilesResponse(
        @JsonProperty("start_weight")
        Double startWeight,
        @JsonProperty("goal_weight")
        Double goalWeight,
        @JsonProperty("activity_level")
        ActivityLevel activityLevel
) {
}
