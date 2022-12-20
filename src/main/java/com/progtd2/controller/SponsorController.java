package com.progtd2.controller;

import com.progtd2.model.Sponsor;
import com.progtd2.service.MatchService;
import com.progtd2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("sponsor")
@AllArgsConstructor
public class SponsorController {
  private final SponsorService service;

  @GetMapping
  public List<Sponsor> findAll(){
    return service.getAll();
  }
}
