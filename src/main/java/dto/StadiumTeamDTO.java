package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.stadium.Stadium;
import model.team.Team;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StadiumTeamDTO {
    private Stadium stadium;
    private List<Team> teams = new ArrayList<>();
}

