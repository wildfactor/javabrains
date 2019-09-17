package io.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Soham", "HSBC"),
                new Topic("2", "Gourav", "Infosys"),
                new Topic("3", "Soumya", "Marlabs"),
                new Topic("1", "Anand", "Accenture")
                ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addtopic(Topic topic) {
        topicRepository.save(topic);
    }
}
