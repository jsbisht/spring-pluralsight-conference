package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService speakerService = new SpeakerServiceImpl();
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);

        SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService2);
    }
}
