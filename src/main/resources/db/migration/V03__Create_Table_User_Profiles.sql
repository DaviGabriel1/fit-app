CREATE TABLE IF NOT EXISTS user_profiles (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     user_id BIGINT NOT NULL,
     start_weight DOUBLE PRECISION NOT NULL,
     goal_weight DOUBLE PRECISION NOT NULL,
     activity_level VARCHAR(255) NOT NULL,
    CONSTRAINT `fk_user_profiles` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
)