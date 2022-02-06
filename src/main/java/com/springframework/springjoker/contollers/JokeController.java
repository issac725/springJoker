package com.springframework.springjoker.contollers;

import com.springframework.springjoker.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author issaclee725 on 6/02/2022
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public  String showJoke(Model model) {

        //Atribute name: mapping key in the view html
        model.addAttribute("joke", jokeService.getJoke());

        //return back to the index view (index.html)
        return "index";
    }

}
