package com.davi.fitapp.user.domain.repositories;

import com.davi.fitapp.user.domain.models.UserProfiles;
import com.davi.fitapp.user.domain.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfilesRepository extends JpaRepository<UserProfiles, Long> {
    Boolean existsUserProfilesByUserId(Users user);
    Optional<UserProfiles> findUserProfilesByUserId(Users user);
}
