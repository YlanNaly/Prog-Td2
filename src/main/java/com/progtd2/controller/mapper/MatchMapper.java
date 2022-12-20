package com.progtd2.controller.mapper;

import com.progtd2.controller.response.MatchResponse;
import com.progtd2.model.Match;
import com.progtd2.model.Team;
import com.progtd2.repository.MatchRepository;
import com.progtd2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class MatchMapper {
  private final TeamRepository repository;
  public MatchResponse toRest(Match match){
    Team teamA = repository.getById(match.getTeamA().getId());
    Team teamB = repository.getById(match.getTeamB().getId());
    return MatchResponse.builder()
            .datetime(match.getDatetime())
            .id(match.getId())
            .teamA(teamA)
            .teamB(teamB)
            .build();
  }

  public List<MatchResponse> toDomain(List<Match> matches){
    return matches.stream().map(this::toRest).toList();
  }
}
