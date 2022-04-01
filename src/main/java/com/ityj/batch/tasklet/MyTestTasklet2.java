package com.ityj.batch.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.concurrent.TimeUnit;

@Slf4j
public class MyTestTasklet2 implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution pStepContribution, ChunkContext pChunkContext) throws InterruptedException {
        log.info("Into MyTestTasklet2...");
        TimeUnit.SECONDS.sleep(1);
        log.info("Received jobContext data:{}", pChunkContext.getStepContext().getJobExecutionContext().get("jobData"));
        return RepeatStatus.FINISHED;
    }
}