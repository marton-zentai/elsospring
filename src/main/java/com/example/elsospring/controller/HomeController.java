package com.example.elsospring.controller;

import com.example.elsospring.domain.Story;
import com.example.elsospring.repository.StoryRepo;
import com.example.elsospring.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    private  StoryService storyService;
    @Autowired
    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }

    @RequestMapping("/")
    public String stories(Model model, Locale locale) {
        model.addAttribute("pageTitle", "OSSZES");
        model.addAttribute("stories", storyService.getStories());
        return "stories";
    }

    /*@RequestMapping("/story")
    public String story(Model model) {
        model.addAttribute("pageTitle", "LEGUJABB");
        model.addAttribute("story", storyService.getStory());
        return "story";
    }

    //olyan metodus ahol az eleresi utbol veszunk ki reszt mint valtozo
    @RequestMapping("/title/{title}")
    public String searchForStory(@PathVariable(value = "title") String title, Model model) throws Exception {
        if (title == null) {
            throw new Exception("Nincs ilyen cimmmel sztori");
        }
        model.addAttribute("story", storyService.getSpecificStory(title));
        return "story";
    }*/

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest request, Exception ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "exceptionHandler";
    }

}
