package com.davi.fitapp.user.domain.models;

import com.davi.fitapp.user.domain.enums.ActivityLevel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Users userId;

    private double startWeight;

    private double goalWeight;

    @Enumerated(value = EnumType.STRING)
    private ActivityLevel activityLevel;
}
