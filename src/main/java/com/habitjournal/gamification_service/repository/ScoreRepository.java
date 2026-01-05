package com.habitjournal.gamification_service.repository;

import com.habitjournal.gamification_service.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository  extends JpaRepository<Score,Long> {
    List<Score> findByUserId(Long userId);
}
