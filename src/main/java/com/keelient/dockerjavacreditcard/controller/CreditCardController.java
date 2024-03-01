package com.keelient.dockerjavacreditcard.controller;

import com.keelient.dockerjavacreditcard.entity.CreditCardEntity;
import com.keelient.dockerjavacreditcard.entity.CreditScore;
import com.keelient.dockerjavacreditcard.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class CreditCardController {
    @Autowired
    CreditCardRepository creditCardRepository;

    @Autowired
    private RestTemplate restTempalte;

    @PostMapping("/issueCard")
    @ResponseBody
    public boolean issueCard(@RequestBody CreditCardEntity card){
        if(getScore(card.getSsn()) >= 700){
            creditCardRepository.save(card);
            return true;
        }
        return false;
    }

    private int getScore(String ssn) {
        CreditScore creditScore = restTempalte.getForObject("http://creditscore-app:9999/creditscore/creditscores/" +
                                    ssn, CreditScore.class);
        return creditScore.getScore();
    }
}
