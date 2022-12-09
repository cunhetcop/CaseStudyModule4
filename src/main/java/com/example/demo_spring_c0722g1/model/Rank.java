package com.example.demo_spring_c0722g1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rank {
    @Id
    private long id;
    private String rankstar;
    private double ranksalary;

}
