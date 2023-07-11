package model.outplayer;

import lombok.*;

import java.sql.Timestamp;

@Getter @Setter @AllArgsConstructor @ToString
public class OutPlayer {
    private String reason;
    private Timestamp createdAt;
}
