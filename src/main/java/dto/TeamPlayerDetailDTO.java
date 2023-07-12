package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @AllArgsConstructor @ToString
public class TeamPlayerDetailDTO {
    // 팀
    private Integer stadiumId;
    private String teamName;
    private Timestamp teamDate;

    //플레이어
    private Integer teamId;
    private String PlayerName;
    private String position;
    private Timestamp joinDate;

    //아웃플레이어
    private Integer playerId;
    private String reason;
    private Timestamp outDate;

}
