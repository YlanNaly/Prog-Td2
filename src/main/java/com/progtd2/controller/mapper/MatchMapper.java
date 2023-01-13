package com.progtd2.controller.mapper;

import com.progtd2.controller.response.GoalResponse;
import com.progtd2.controller.response.MatchResponse;
import com.progtd2.model.Goal;
import com.progtd2.model.Match;
import com.progtd2.model.Player;
import com.progtd2.model.Team;
import com.progtd2.repository.MatchRepository;
import com.progtd2.repository.PlayerRepository;
import com.progtd2.repository.TeamRepository;
import com.progtd2.service.GoalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class MatchMapper {
  private final TeamRepository repository;
  private final PlayerRepository playerRepository;
  private final GoalMapper goalMapper;
  private final GoalService goalService;

  public MatchResponse toRest(Match match){
    Team teamA = repository.getById(match.getTeamA().getId());
    Team teamB = repository.getById(match.getTeamB().getId());

    Player playerA = playerRepository.findByTeamName(teamA.getName());
    Player playerB = playerRepository.findByTeamName(teamB.getName());

    Goal goalA = new Goal();
    Goal goalB = new Goal() ;

    List<GoalResponse> goals = goalMapper.toRest(goalService.getAllGoal());

    for (GoalResponse goal : goals) {
      if (goal.getPlayer_name().equals(playerA.getName())) {
        goalA.setScorer(playerRepository.getById(playerA.getId()));
      } else if (goal.getPlayer_name().equals(playerB.getName())) {
        goalB.setScorer(playerRepository.getById(playerB.getId()));
      }
    }

    return MatchResponse.builder()
            .datetime(match.getDatetime())
            .id(match.getId())
            .teamA(teamA)
            .teamB(teamB)
            .score_a(goalA)
            .score_b(goalB)
            .build();
  }

  public List<MatchResponse> toDomain(List<Match> matches){
    return matches.stream().map(this::toRest).toList();
  }
}
