package com.example.demoJpa.repository;

import com.example.demoJpa.entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TopicRepository extends CrudRepository<TopicEntity,String>

{
    static void add(TopicEntity t) {
    }
}
