package com.progtd2.controller.mapper;

import com.progtd2.controller.response.MatchResponse;
import com.progtd2.model.Match;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MatchMapper {

  public MatchResponse toRest(Match match){
    return MatchResponse.builder()
            .datetime(match.getDatetime())
            .id(match.getId())
            .teams(match.getTeams())
            .build();
  }

  public List<MatchResponse> toDomain(List<Match> matches){
    return matches.stream().map(this::toRest).toList();
  }
}
