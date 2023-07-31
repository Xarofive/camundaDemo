package com.camunda.demo.camundademo.deligate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CheckWeatherDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random random = new Random();
//        execution.setVariable("name", "John");
        execution.setVariable("weather", random.nextInt(4));
    }
}
