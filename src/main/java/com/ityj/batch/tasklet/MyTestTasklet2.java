package com.ityj.batch.tasklet;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
public class MyTestTasklet2 implements Tasklet {

    @SneakyThrows
    @Override
    public RepeatStatus execute(StepContribution pStepContribution, ChunkContext pChunkContext) {
        log.info("Into MyTestTasklet2...");
        TimeUnit.SECONDS.sleep(3);
        StepContext stepContext = pChunkContext.getStepContext();
        Map<String, Object> jobParameters = stepContext.getJobParameters();
        log.info("Received job parameters2:{}", jobParameters.toString());
        return RepeatStatus.FINISHED;
    }
}