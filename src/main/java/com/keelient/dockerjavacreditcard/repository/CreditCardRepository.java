package com.keelient.dockerjavacreditcard.repository;


import com.keelient.dockerjavacreditcard.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity, String> {
}
