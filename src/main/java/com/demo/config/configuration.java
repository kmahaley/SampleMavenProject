package com.demo.config;

import com.demo.data.TopicData;
import com.demo.service.TopicService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author km185223
 */

@Configuration
public class configuration {

    @Bean
    public TopicData getTopicDataBean(){
        return new TopicData();
    }

    @Bean
    public TopicService getTopicServiceBean(TopicData topicData){
        return new TopicService(topicData);
    }


}
