package com.example.demoJpa.controller;

import com.example.demoJpa.entity.TopicEntity;
import com.example.demoJpa.service.TopicService;
import com.example.demoJpa.service.impl.TopicServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;

class TesControllerTest {
    //dummy object
    @Mock
    TopicServiceImpl topicService;

    TesController tesController;


    @BeforeEach
    void multiply() {
        MockitoAnnotations.openMocks(this);
        this.tesController = new TesController(topicService);
        System.out.println("running before each");
    }


    @Test
    void getTopicById() {
        TopicEntity topicEntity = new TopicEntity();
        topicEntity.setId("java");
        String id = "id1";
        //mocking the service layer when called with "id1" then return topic entity
        Mockito.when(topicService.getTopic("id1"))
                .thenReturn(topicEntity);
        //calling the actual controller class
        TopicEntity topicEntity1 = tesController.getTopic(id);

        System.out.println(topicEntity1);
        System.out.println(topicEntity);
        assertEquals(topicEntity, topicEntity1, "equals");
    }

    @Test
    void deleteTopic() {
        String id = "id2";
        tesController.deleteTopic(id);
        Mockito.doNothing().when(topicService).deleteTopic("id2");


    }


}



