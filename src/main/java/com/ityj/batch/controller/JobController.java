package com.ityj.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.ListableJobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private ListableJobLocator jobLocator;

    @GetMapping("/launch/{name}")
    public String launchJob(@PathVariable("name") String jobName) throws Exception {
        Job job = jobLocator.getJob(jobName);
        this.jobLauncher.run(job, new JobParameters());
        return "success";
    }

}
