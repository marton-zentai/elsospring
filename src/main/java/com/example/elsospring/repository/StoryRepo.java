package com.example.elsospring.repository;

import com.example.elsospring.domain.Story;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepo extends CrudRepository<Story, Long> {

    //SELECT * FROM STORY
    List<Story> findAll();

    //SELECT * FROM STORY WHERE posted IN (SELECT MAX(posted) FROM STORIES) LIMIT 1;
    Story findFirstByOrderByPostedDesc();

    //@Query(value = "SELECT * FROM STORY WHERE title = :title", nativeQuery = true)
    @Query(value = "SELECT s FROM Story s WHERE s.title = :title")
    Story findByTitle(@Param("title") String title);

    List<Story> findAllByBloggerNameIgnoreCaseOrderByPostedDesc(String name);
}
