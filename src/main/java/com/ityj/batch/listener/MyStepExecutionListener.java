package com.ityj.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

@Slf4j
public class MyStepExecutionListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("StepListener --> beforeStep:{}...", stepExecution.getStepName());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("StepListener --> afterStep:{}...", stepExecution.getStepName());

        log.info("ExitCode:{}", stepExecution.getExitStatus().getExitCode());
        return ExitStatus.COMPLETED;
    }
}
