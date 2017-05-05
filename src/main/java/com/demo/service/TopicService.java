package com.demo.service;

import java.util.List;

import com.demo.data.TopicData;
import com.demo.model.Topic;

/**
 * @author km185223
 */
public class TopicService {

    TopicData topicData;

    public TopicService(TopicData topicData) {
        this.topicData = topicData;
    }

    public List<Topic> getTopicsFromService() {
        return topicData.getListOfTopics();
    }

    public Topic addTopicsFromService(Topic topic) {
        return topicData.addTopic(topic);
    }

    public Topic modifyTopicsFromService(Topic topic) {
        return topicData.modifyTopic(topic);
    }

    public Topic deleteTopicsFromService(Topic topic){
        return topicData.deleteTopic(topic);
    }
}

