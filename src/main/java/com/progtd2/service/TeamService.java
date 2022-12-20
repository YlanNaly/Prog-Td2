package com.progtd2.service;

import com.progtd2.model.Team;
import com.progtd2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
  private final TeamRepository repository;
  public List<Team> getAll(){
    return repository.findAll();
  }
}
