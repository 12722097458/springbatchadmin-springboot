package com.ityj.batch.decider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

import java.util.Map;

@Slf4j
public class MyJobExecutionDecider  implements JobExecutionDecider {
    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
        Map<String, JobParameter> parameters = jobExecution.getJobParameters().getParameters();

        if (parameters.containsKey("skip")) {
            return new FlowExecutionStatus("SKIP");
        }
        return new FlowExecutionStatus("CONTINUE");
    }
}
