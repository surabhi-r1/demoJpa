package com.example.demoJpa.repository;

import com.example.demoJpa.entity.TopicEntity;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.demoJpa.repository.TopicRepository.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;



class TopicRepositoryTest {
    @Autowired
    TopicRepository topicRepository;

    @Test
    @Order(1)
    public void addTopicTest() {
        TopicEntity t = new TopicEntity();
        t.setId("java5");
        t.setName("java3");
        t.setDescription("java3");

        topicRepository.save(t);
        assertNotNull(topicRepository.findById("java5").get());
    }


    @Test
    @Order(2)
    public void testUpdate() {
        TopicEntity t = topicRepository.findById("java5").get();
        t.setName("core java5");
        topicRepository.save(t);

    }

    @Test
    @Order(3)
    public void deteteTopicTest() {
        topicRepository.deleteById("java3");
        assertThat(topicRepository.existsById("java3")).isFalse();
    }
}