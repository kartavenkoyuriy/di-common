package edu.springguru.dicommon.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello GreetingServiceImpl";

    @Override
    public String sayGreetings() {
       return HELLO;
    }
}
