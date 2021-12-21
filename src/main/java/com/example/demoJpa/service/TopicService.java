package com.example.demoJpa.service;

import antlr.ASTNULLType;
import com.example.demoJpa.entity.TopicEntity;
import com.example.demoJpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;



public interface TopicService {

    List<TopicEntity> getAllTopics();



    void updateTopic(String id, TopicEntity topicEntity);

    void deleteTopic(String id);

    void addTopic(TopicEntity topic);

    TopicEntity getTopic(String id);
}