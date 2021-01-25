package com.learn.jay.singleton;

import java.time.LocalDateTime;

/**
 * Created by Jayanta for learning purpose
 */
public class MySingleton {
    private static MySingleton instance;

    private LocalDateTime createdDate;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                    instance.setCreatedDate(LocalDateTime.now());
                }
            }
        }

        return instance;
    }

    private static void setInstance(MySingleton instance) {
        MySingleton.instance = instance;
    }

    private LocalDateTime getCreatedDate() {
        return createdDate;
    }

    private void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s :: %s:%s:%s", this.getCreatedDate().getYear(),
                this.createdDate.getMonth().toString(), this.createdDate.getDayOfYear(),
                this.createdDate.getHour(), this.createdDate.getMinute(),
                this.createdDate.getSecond());
    }
}
