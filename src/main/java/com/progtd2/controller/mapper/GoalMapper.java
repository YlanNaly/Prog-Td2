package com.progtd2.controller.mapper;
import com.progtd2.controller.response.GoalResponse;
import com.progtd2.controller.response.PlayerResponse;
import com.progtd2.model.Goal;
import com.progtd2.model.Player;
import com.progtd2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GoalMapper {
  private final PlayerRepository playerRepository;

  public GoalResponse toRest(Goal goal){
    Player player1 = playerRepository.getReferenceById(goal.getScorer().getId());
    return
            GoalResponse.builder()
                    .player_name(player1.getName())
                    .build();
  }

  public List<GoalResponse> toRest(List<Goal> players){
    return players.stream().map(this::toRest).toList();
  }
}
