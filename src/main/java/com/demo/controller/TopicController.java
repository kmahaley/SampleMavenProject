package com.demo.controller;

import java.util.List;

import com.demo.model.Topic;
import com.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author km185223
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping(value="/topics")
    public List<Topic> getTopics(){
        return topicService.getTopicsFromService();
    }

}
