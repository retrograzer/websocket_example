package com.cooksys.websocket.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.cooksys.websocket.component.NumberHandler;

@Service
public class NumberService {

    private AtomicInteger counter = new AtomicInteger(0);

    @Autowired
    NumberHandler numberHandler;

    @Scheduled(fixedDelay = 3000)
    public void send() {
    	System.out.println("Sending number: " + counter.get());
        numberHandler.counterIncrementedCallback(counter.get());
    }
    
    public void increment()
    {
    	System.out.println("New value: " + counter.incrementAndGet());
    }

}