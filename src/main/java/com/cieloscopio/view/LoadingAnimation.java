package com.cieloscopio.view;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class LoadingAnimation {

    private LoadingAnimation() {}

    public static void show(String message, int durationMs) {

        String[] frames = {"⠋","⠙","⠹","⠸","⠼","⠴","⠦","⠧","⠇","⠏"};

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        final int[] i = {0};

        var task = scheduler.scheduleAtFixedRate(
                () -> System.out.print("\r" + frames[i[0]++ % frames.length] + " " + message),
                0,
                100,
                TimeUnit.MILLISECONDS
        );

        try {
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        task.cancel(true);

        scheduler.shutdown();

        try {
            if (!scheduler.awaitTermination(200, TimeUnit.MILLISECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.print("\r");
    }
}