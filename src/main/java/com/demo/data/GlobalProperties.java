package com.demo.data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author km185223
 */
@ConfigurationProperties("logging.level")
public class GlobalProperties {
    private String comError;

    private String orgLevel;

    public String getComError() {
        return comError;
    }

    public void setComError(String comError) {
        this.comError = comError;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }
}

