package com.example.elsospring.repository;

import com.example.elsospring.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoryRepo extends CrudRepository<Story, Long> {

    //SELECT * FROM STORY
    List<Story> findAll();

    //SELECT * FROM STORY WHERE posted IN (SELECT MAX(posted) FROM STORIES) LIMIT 1;
    Story findFirstByOrderByPostedDesc();

    Story findByTitle(String title);
}
