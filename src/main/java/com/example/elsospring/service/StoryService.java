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

    public Story getSpecificStory(String title) {
        return storyRepo.findByTitle(title);
    }
}
