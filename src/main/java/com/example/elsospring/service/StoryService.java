package com.example.elsospring.service;

import com.example.elsospring.domain.Blogger;
import com.example.elsospring.domain.Story;
import com.example.elsospring.repository.BloggerRepo;
import com.example.elsospring.repository.StoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class StoryService {

    private StoryRepo storyRepo;
    private BloggerRepo bloggerRepo;

    @Autowired
    public void setStoryRepo(StoryRepo storyRepo) {
        this.storyRepo = storyRepo;
    }
    @Autowired
    public void setBloggerRepo(BloggerRepo bloggerRepo) {
        this.bloggerRepo = bloggerRepo;
    }

    public List<Story> getStories() {
        return storyRepo.findAll();
    }

    public Story getStory() {
        return storyRepo.findFirstByOrderByPostedDesc();
    }

    //Ezt vegul nem hasznaljuk - hasonlo volt a szerepe mint a data.sql amikor @PostConstruct annotacio volt elotte
    public void init() {
        Blogger blogger = new Blogger("BelsőGyula", 25);
        bloggerRepo.save(blogger);

        Story story = new Story("Belső cím", "Belső tartalom", new Date(), blogger);
        storyRepo.save(story);

    }

    public Story getSpecificStory(String title) {
        return storyRepo.findByTitle(title);
    }
}
