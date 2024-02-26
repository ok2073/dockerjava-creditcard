package com.keelient.dockerjavacreditcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="credit_card")
public class CreditCardEntity {
    @Id
    private String ssn;
    private String firstName;
    private String lastName;
    private String cardNumber;
    private Date expiryDate;
    private int secCode;
}
