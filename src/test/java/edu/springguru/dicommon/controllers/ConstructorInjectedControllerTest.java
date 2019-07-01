package edu.springguru.dicommon.controllers;

import static org.junit.Assert.*;

import edu.springguru.dicommon.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        propertyInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}