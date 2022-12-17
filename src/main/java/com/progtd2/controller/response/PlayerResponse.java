package com.progtd2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
public class PlayerResponse {
  private Long id;
  private String name;
}
