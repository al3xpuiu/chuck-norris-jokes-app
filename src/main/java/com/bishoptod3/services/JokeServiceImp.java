package com.bishoptod3.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Loky on 07/08/2018.
 */
@Service
public class JokeServiceImp implements JokeService {

    private final ChuckNorrisQuotes quotes;

    @Autowired
    public JokeServiceImp(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
