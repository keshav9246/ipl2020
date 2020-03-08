package com.cricket.ipl2020.prediction.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users", schema = "ipl2020")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Users {

    @Id
    private String user_name;
    private String password;
    private float score;
}
