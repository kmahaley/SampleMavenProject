package com.demo.data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Application configuration defined for the class
 *
 * @author km185223
 */
@ConfigurationProperties
public class ApplicationConfigurations {
    private int threadPool;

    private String email;

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
