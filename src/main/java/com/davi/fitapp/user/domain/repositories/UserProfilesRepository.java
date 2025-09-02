package com.davi.fitapp.user.domain.repositories;

import com.davi.fitapp.user.domain.models.UserProfiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfilesRepository extends JpaRepository<UserProfiles, Long> {
}
