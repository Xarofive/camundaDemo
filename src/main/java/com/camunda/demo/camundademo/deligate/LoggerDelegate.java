package com.camunda.demo.camundademo.deligate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LoggerDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info(stringBuilder.append("\n\n ... LoggerDelegate invoked by ")
                .append("processDefinitionId= ")
                .append(execution.getCurrentActivityId())
                .append(", variable=")
                .append(execution.getVariables())
                .append(", activityId= ")
                .append(execution.getCurrentActivityId())
                .append(", activityName= ")
                .append(execution.getCurrentActivityName())
                .append(", processInstanceId= ")
                .append(execution.getProcessInstanceId())
                .append(", businessKey= ")
                .append(execution.getProcessBusinessKey())
                .append(", executionId= ")
                .append(execution.getId())
                .append("\n\n")
                .toString());
    }
}
