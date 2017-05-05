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
    private String descr;

    /**
     * Id of the topic
     */
    private int id;

    public Topic(int id, String name, String descr) {
        this.name = name;
        this.descr = descr;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
