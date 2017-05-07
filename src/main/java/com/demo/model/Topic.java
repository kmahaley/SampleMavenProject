package com.demo.model;


/**
 *  Topic describes details in the format of name, id, description
 *
 * @author km185223
 */
public class Topic {
    /**
     * Name of the topic
     */
    private String name;

    /**
     * Short description of the topic
     */
    private String description;

    /**
     * Id of the topic
     */
    private int id;

    public Topic(){
        /*
         *Default method
         */
    }

    public Topic(int id, String name, String description) {
        this.name = name;
        this.description = description;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
