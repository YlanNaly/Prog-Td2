package com.progtd2.service;

import com.progtd2.model.Match;
import com.progtd2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
  private final MatchRepository repository;

  public List<Match> getAll(){
    return repository.findAll();
  }
}
