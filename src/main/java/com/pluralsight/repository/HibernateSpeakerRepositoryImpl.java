package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Autowired
    private Calendar cal;

    // SpEL
    // Used to manipulate object graph,
    // Evaluate values at runtime,
    // Manipulate configuration
    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Jagdeep");
        speaker.setLastName("Bisht");
        // Use value from runtime
        speaker.setSeedNum(seedNum);
        speakers.add(speaker);

        System.out.println(cal.getTime());

        return speakers;
    }
}
