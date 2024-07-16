package ru.alina.camunda.tutorial;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class InternalServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final String procVar1 = (String) delegateExecution.getVariable("параметр1");
        System.out.println(String.format("Lesson5Delegate.execute, procVar1='%s'", procVar1));
    }
}
