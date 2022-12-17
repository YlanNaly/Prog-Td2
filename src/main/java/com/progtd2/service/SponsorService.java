package com.progtd2.service;

import com.progtd2.model.Player;
import com.progtd2.model.Sponsor;
import com.progtd2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
  private final SponsorRepository repository;
  public List<Sponsor> getAll(){
    return repository.findAll();
  }
}
