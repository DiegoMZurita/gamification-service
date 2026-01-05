package com.habitjournal.gamification_service.service;

import com.habitjournal.gamification_service.controller.dto.HabitCompletionResponseDTO;
import com.habitjournal.gamification_service.model.Score;

import java.util.List;

public interface ScoreService {
    void processHabitCompletion(Long userId, String habitId);
    List<HabitCompletionResponseDTO> getScoresByUserId(Long userId);
}
