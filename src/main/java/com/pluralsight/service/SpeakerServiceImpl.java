package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Speaker Service no arg constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speaker Service repository constructor");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Calling the autowired method");
        this.repository = repository;
    }
}
