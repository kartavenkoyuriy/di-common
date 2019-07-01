package edu.springguru.dicommon.services;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello from PRIMARY";
    }
}
