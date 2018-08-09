package com.bishoptod3.controllers;

import com.bishoptod3.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Loky on 06/08/2018.
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        model.addAttribute( "jokes", jokeService.getJoke() );

        return "jokesTemplate";
    }

}
