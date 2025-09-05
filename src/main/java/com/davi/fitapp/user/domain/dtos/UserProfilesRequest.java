package com.davi.fitapp.user.domain.dtos;

import com.davi.fitapp.user.domain.enums.ActivityLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public record UserProfilesRequest(
        @JsonProperty("start_weight")
        double startWeight,
        @JsonProperty("goal_weight")
        double goalWeight,
        @JsonProperty("activity_level")
        ActivityLevel activityLevel
) {
}
