package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.outplayer.OutPlayer;
import model.player.Player;
import model.team.Team;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @AllArgsConstructor @ToString
public class TeamPlayerDTO {
    private Team team;
    private List<Player> players = new ArrayList<>();
    private List<OutPlayer> outPlayers = new ArrayList<>();
}

