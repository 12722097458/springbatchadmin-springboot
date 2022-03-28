package com.ityj.batch.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {

    public static void main(String[] args) throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail jobDetail = JobBuilder.newJob(MyQuartzJob.class)
                .withIdentity("job01-myjob", "group01-job")
                .build();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("Trigger01", "group01-trigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?"))
                .build();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }

}
