package edu.springguru.dicommon.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "injected service GetterGreetingService";
    }
}
