package com.progtd2.controller;

import com.progtd2.controller.mapper.MatchMapper;
import com.progtd2.controller.response.MatchResponse;
import com.progtd2.model.Match;
import com.progtd2.model.Sponsor;
import com.progtd2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("match")
@AllArgsConstructor
public class MatchController {
  private final MatchService service;
  private final MatchMapper mapper;
  @GetMapping
  public List<MatchResponse> findAll(){
    return mapper.toDomain(service.getAll());
  }
}
