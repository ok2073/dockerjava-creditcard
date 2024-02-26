package com.keelient.dockerjavacreditcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditScore {
    private String ssn;
    private String firstName;
    private String lastName;
    private int score;
}
