package com.progtd2.controller.response;

import com.progtd2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
public class MatchResponse {
  private Long id;
  private Date datetime;
  private List<Team> teams;
}
