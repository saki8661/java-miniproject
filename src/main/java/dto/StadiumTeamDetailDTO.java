package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StadiumTeamDetailDTO {
    // 야구장
    private String stadiumName;
    private Timestamp stadiumDate;

    // 팀
    private Integer stadiumId;
    private String teamName;
    private Timestamp teamDate;
}
