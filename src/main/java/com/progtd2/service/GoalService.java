package com.progtd2.service;

import com.progtd2.controller.response.GoalResponse;
import com.progtd2.model.Goal;
import com.progtd2.repository.GoalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GoalService {
  private final GoalRepository repository;

  public List<Goal> getAllGoal(){
    return repository.findAll();
  }

}
