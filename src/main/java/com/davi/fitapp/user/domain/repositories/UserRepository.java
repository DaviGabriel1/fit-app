package com.davi.fitapp.user.domain.repositories;

import com.davi.fitapp.user.domain.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findUsersByUuid(UUID uuid);
}
