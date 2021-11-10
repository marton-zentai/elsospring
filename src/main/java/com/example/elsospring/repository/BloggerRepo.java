package com.example.elsospring.repository;

import com.example.elsospring.domain.Blogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BloggerRepo {

    private JdbcTemplate jdbc;

    @Autowired
    public BloggerRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
