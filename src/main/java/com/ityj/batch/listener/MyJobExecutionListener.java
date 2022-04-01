package com.ityj.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.item.ExecutionContext;

@Slf4j
public class MyJobExecutionListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("JobListener --> Before job:{}", jobExecution.getJobInstance().getJobName());
        ExecutionContext executionContext = jobExecution.getExecutionContext();
        // pass data through executionContext
        executionContext.put("jobData", "jobListener");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {

        log.info("After job, status is:{}", jobExecution.getExitStatus());

    }
}
