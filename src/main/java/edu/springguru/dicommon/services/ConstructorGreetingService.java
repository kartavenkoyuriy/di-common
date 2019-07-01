package edu.springguru.dicommon.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "injected service ConstructorGreetingService";
    }
}
