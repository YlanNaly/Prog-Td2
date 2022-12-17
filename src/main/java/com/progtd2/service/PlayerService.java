package com.progtd2.service;

import com.progtd2.model.Player;
import com.progtd2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.ASC;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepository repository;

  public List<Player> getAll(int page , int pageSize){
    Pageable pageable = PageRequest.of(page, pageSize ,ASC , "number");
    return repository.findAll(pageable).toList();
  }
}
