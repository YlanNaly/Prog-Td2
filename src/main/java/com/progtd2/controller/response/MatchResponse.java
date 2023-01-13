package com.progtd2.controller.response;

import com.progtd2.model.Goal;
import com.progtd2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatchResponse {
  private Long id;
  private Date datetime;
  private Team teamA;
  private Team teamB;
  private Goal score_a;
  private Goal score_b;
}
