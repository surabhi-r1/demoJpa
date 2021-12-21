package com.example.demoJpa.repository;

import com.example.demoJpa.entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<TopicEntity,String>
{

}
