package com.bishoptod3.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Loky on 09/08/2018.
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
