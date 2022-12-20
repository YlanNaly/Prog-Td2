package com.progtd2.controller.mapper;

import com.progtd2.controller.response.PlayerResponse;
import com.progtd2.model.Player;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlayerMapper {
  public PlayerResponse toRest(Player player){
    return PlayerResponse.builder()
            .id(player.getId())
            .name(player.getName())
            .build();
  }

  public List<PlayerResponse> toRest(List<Player> players){
    return players.stream().map(this::toRest).toList();
  }
}
