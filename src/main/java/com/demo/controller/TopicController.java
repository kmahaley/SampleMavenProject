package com.demo.controller;

import java.util.List;
import javax.websocket.server.PathParam;

import com.demo.data.ApplicationConfigurations;
import com.demo.model.Topic;
import com.demo.service.TopicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author km185223
 */
@RestController
public class TopicController {


    private TopicService topicService;

    private ApplicationConfigurations applicationConfigurations;

    public TopicController(TopicService topicService, ApplicationConfigurations applicationConfigurations) {
        this.topicService = topicService;
        this.applicationConfigurations = applicationConfigurations;
    }

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getTopics() {
        System.out.println(applicationConfigurations.getEmail()+" -> "+applicationConfigurations.getThreadPool());
        return topicService.getTopicsFromService();
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public Topic addTopics(Topic topic) {
        return topicService.addTopicsFromService(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopicsFromId(@PathParam("id") int id) {
        return null;
    }

}
