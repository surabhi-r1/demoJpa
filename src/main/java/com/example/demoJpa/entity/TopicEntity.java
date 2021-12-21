package com.example.demoJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicEntity {
    @Id
    private String id;
    private String name;
    private String description;
    public TopicEntity() {
    }

    public String getId() {
        return id;
    }

    public TopicEntity(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

