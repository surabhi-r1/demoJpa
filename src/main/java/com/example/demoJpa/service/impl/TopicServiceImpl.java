package com.example.demoJpa.service.impl;

import com.example.demoJpa.entity.TopicEntity;
import com.example.demoJpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImpl implements com.example.demoJpa.service.TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public TopicServiceImpl() {
        this.topicRepository = topicRepository;
    }

    @Override
    public List<TopicEntity> getAllTopics() {
        List<TopicEntity> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public TopicEntity getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(TopicEntity topic) {
        topicRepository.save(topic);
        //  return topic;
    }

    public void updateTopic(String id, TopicEntity topic) {

        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);

    }
}