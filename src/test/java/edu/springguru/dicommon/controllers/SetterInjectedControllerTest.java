package edu.springguru.dicommon.controllers;

import static org.junit.Assert.*;

import edu.springguru.dicommon.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        propertyInjectedController = new SetterInjectedController();
        propertyInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}