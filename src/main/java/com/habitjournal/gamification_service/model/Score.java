package com.habitjournal.gamification_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "scores")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; //ID del usuario que ganó los puntos

    private String habitId;

    private int points;
    private LocalDateTime awardedAt;

    @PrePersist
    public void prePersist(){
        if(this.awardedAt == null){
            this.awardedAt = LocalDateTime.now();
        }
    }
    // Constructor helper
    public Score (Long userId, String habitId, int points) {
        this.userId = userId;
        this.habitId = habitId;
        this.points = points;
        this.awardedAt = LocalDateTime.now();
    }

}
