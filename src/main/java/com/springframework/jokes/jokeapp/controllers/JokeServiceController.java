package com.springframework.jokes.jokeapp.controllers;

import com.springframework.jokes.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeServiceController {

    private JokeService jokeService;

    @Autowired
    public JokeServiceController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJokes());

        return "chucknorris";
    }
}
