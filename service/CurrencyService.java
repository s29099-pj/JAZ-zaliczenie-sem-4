package com.example.jaz_zaliczenie_s29099.service;

import com.example.jaz_zaliczenie_s29099.model.Waluty_s29099;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CurrencyService {
    private final RestTemplate restTemplate;

    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Waluty_s29099 getMovie(Long id) {
        return  restTemplate.getForObject ("http://api.nbp.pl/api/exchangerates/tables/a/",Waluty_s29099.class);
    }


}

