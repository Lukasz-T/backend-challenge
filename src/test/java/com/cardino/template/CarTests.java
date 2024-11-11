package com.cardino.template;

import com.cardino.template.entity.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CarTests {

    @Autowired
    MockMvc mockMvc;


    @Test
    public void testCarCreation() {
        Car expectedCar = new Car();



    }
}
