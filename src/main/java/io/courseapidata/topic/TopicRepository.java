package io.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    //getAllTopics()
    //getTopic(String Id)
    //updateTopic(topic t)
    //deleteTopic(String Id)
}
