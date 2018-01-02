package com.teamsearcher.controller;


import com.teamsearcher.model.Game;
import com.teamsearcher.service.FormService;
import com.teamsearcher.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class test {

    @Autowired
    GameService gameService;

    @Autowired
    FormService formService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String games(Map<String,Object> model) {

        model.put("Games",gameService.allGames());
        model.put("Forms",formService.allForms());
        return "index";
    }
}
