package com.example.elsospring.controller;

import com.example.elsospring.domain.Story;
import com.example.elsospring.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private StoryService storyService;
    @Autowired
    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }


    @RequestMapping("/story")
    public Story story() {
        return storyService.getStory();
    }

    //olyan metodus ahol az eleresi utbol veszunk ki reszt mint valtozo
    @RequestMapping("/title/{title}")
    public Story searchForStory(@PathVariable(value = "title") String title) throws Exception {
        return storyService.getSpecificStory(title);
    }

    @RequestMapping("/stories/{name}")
    public List<Story> getStoriesByBloggerName(@PathVariable(value = "name") String name) throws Exception {
        return storyService.getStoriesByBloggerName(name);
    }
}
