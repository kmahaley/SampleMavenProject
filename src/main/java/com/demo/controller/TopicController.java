package com.demo.controller;

import java.util.List;
import javax.websocket.server.PathParam;

import com.demo.data.ApplicationConfigurations;
import com.demo.data.GlobalProperties;
import com.demo.model.Topic;
import com.demo.service.TopicService;
import org.springframework.web.bind.annotation.RequestBody;
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

    private GlobalProperties globalProperties;

    public TopicController(
            TopicService topicService,
            ApplicationConfigurations applicationConfigurations,
            GlobalProperties globalProperties) {

        this.topicService = topicService;
        this.applicationConfigurations = applicationConfigurations;
        this.globalProperties = globalProperties;
    }

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getTopics() {
        System.out.println(applicationConfigurations.getEmail()+" -> "+applicationConfigurations.getThreadPool());
        System.out.println(globalProperties.getOrgLevel()+" -> "+globalProperties.getComError());
        return topicService.getTopicsFromService();
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public Topic addTopics(@RequestBody Topic topic) {
        return topicService.addTopicsFromService(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopicsFromId(@PathParam("id") int id) {
        return null;
    }

}
