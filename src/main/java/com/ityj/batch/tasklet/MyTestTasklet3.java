package com.ityj.batch.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.Map;

@Slf4j
public class MyTestTasklet3 implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution pStepContribution, ChunkContext pChunkContext) {
        log.info("Into MyTestTasklet3...");
        StepContext stepContext = pChunkContext.getStepContext();
        Map<String, Object> jobParameters = stepContext.getJobParameters();
        log.info("Received job parameters3:{}", jobParameters.toString());
        return RepeatStatus.FINISHED;
    }
}