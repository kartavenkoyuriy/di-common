package edu.springguru.dicommon.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"es", "default"})
public class PrimarySpanishGeetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Spanish - Hello from PRIMARY";
    }
}

