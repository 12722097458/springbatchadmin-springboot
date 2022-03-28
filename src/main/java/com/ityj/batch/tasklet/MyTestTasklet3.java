package com.ityj.batch.tasklet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@Slf4j
public class MyTestTasklet3 implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution pStepContribution, ChunkContext pChunkContext) {
        log.info("Into MyTestTasklet3...");
        return RepeatStatus.FINISHED;
    }
}