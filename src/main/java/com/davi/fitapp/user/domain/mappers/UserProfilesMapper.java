package com.davi.fitapp.user.domain.mappers;

import com.davi.fitapp.user.domain.dtos.UserProfilesRequest;
import com.davi.fitapp.user.domain.dtos.UserProfilesResponse;
import com.davi.fitapp.user.domain.models.UserProfiles;
import com.davi.fitapp.user.domain.models.Users;

public class UserProfilesMapper {

    public static UserProfiles toEntity(UserProfilesRequest userProfilesRequest, Users user) {
        return UserProfiles
                .builder()
                .startWeight(userProfilesRequest.startWeight())
                .goalWeight(userProfilesRequest.goalWeight())
                .activityLevel(userProfilesRequest.activityLevel())
                .userId(user)
                .build();
    }

    public static UserProfilesResponse toDto(UserProfiles userProfiles) {
        return UserProfilesResponse.
                builder()
                .startWeight(userProfiles.getStartWeight())
                .goalWeight(userProfiles.getGoalWeight())
                .activityLevel(userProfiles.getActivityLevel())
                .build();
    }
}
