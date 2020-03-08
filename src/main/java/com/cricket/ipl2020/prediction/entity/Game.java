package com.cricket.ipl2020.prediction.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "games", schema = "ipl2020")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Game {

    @Id
    private int match_id;

    private LocalDate date;
    private String time;
    private String team_home;
    private String team_away;
    private String venue;
    private String winning_team;
    private float winning_score;
}
