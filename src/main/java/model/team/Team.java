package model.team;

import lombok.*;

import java.sql.Timestamp;

@Getter @Setter @AllArgsConstructor @ToString
public class Team {
    private int stadiumId;
    private String name;
    private Timestamp createdAt;
}
