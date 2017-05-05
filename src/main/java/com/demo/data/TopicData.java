package com.demo.data;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.model.Topic;

/**
 * @author km185223
 */
public class TopicData {

    private Map<Integer, Topic> mapOfTopics=new HashMap<>();

    final private Topic[] topics = {
            new Topic(1, "John", "my name is John"),
            new Topic(2, "Danny", "danny boyle"),
            new Topic(3, "Scarlette", "The black widow")
    };

    public TopicData() {
        for (Topic topic : topics) {
            mapOfTopics.put(topic.getId(), topic);
        }
    }

    public List<Topic> getListOfTopics() {
        return new ArrayList<Topic>(mapOfTopics.values());
    }

    public Topic addTopic(Topic topic) {
        mapOfTopics.put(topic.getId(), topic);

        return topic;
    }

    public Topic modifyTopic(Topic topic) {
        if (mapOfTopics.containsKey(topic.getId())) {
            mapOfTopics.put(topic.getId(), topic);
        }

        return topic;
    }

    public Topic deleteTopic(Topic topic) {
        if (mapOfTopics.containsKey(topic.getId())) {
            mapOfTopics.remove(topic.getId());
        }

        return topic;
    }
}
