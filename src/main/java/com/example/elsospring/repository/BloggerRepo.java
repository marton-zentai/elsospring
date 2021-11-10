package com.example.elsospring.repository;

import com.example.elsospring.domain.Blogger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloggerRepo extends CrudRepository<Blogger, Long> {
    List<Blogger> findAll();
}
