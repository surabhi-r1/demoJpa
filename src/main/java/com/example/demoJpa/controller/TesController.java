package com.example.demoJpa.controller;

import com.example.demoJpa.entity.TopicEntity;
import com.example.demoJpa.service.TopicService;
import com.example.demoJpa.service.impl.TopicServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/topics")
public class TesController {

    private final TopicService topicService;

    public TesController(TopicService topicServiceImpl) {
        this.topicService = topicServiceImpl;
    }

    @GetMapping()
    public List<TopicEntity> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public TopicEntity getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping
    public void addTopic(@RequestBody TopicEntity topic) {
        topicService.addTopic(topic);
    }

    @PutMapping(value = "/{id}")
    public void updateTopic(@RequestBody TopicEntity topicEntity, @PathVariable String id) {
        topicService.updateTopic(id, topicEntity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}

