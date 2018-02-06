package Lesson4.ThreadExamples.others;


import Lesson4.ThreadExamples.basic.SomeRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by eduardo on 10/01/17.
 */
public class MainTask {

    private static final int TIME = 5000;

    public static void main(String[] args) {
        System.out.println("Thread Task ");

        Runnable runnable = new SomeRunnable();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(runnable, TIME, TimeUnit.MILLISECONDS);
        scheduledExecutorService.shutdown();
    }
}
