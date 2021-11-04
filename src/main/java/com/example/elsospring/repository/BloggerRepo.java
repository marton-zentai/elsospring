package com.example.elsospring.repository;

import com.example.elsospring.domain.Blogger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloggerRepo extends CrudRepository<Blogger, Long> {
    List<Blogger> findAll();
}
