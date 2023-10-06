package com.example.springactuator.actuators.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.stereotype.Component;

@Component
public class MyCustomHealthIndicator implements HealthIndicator {
    @Autowired
    private MetricsEndpoint metricsEndpoint;

    @Override
    public Health health() {
        return Health
                .up()
                .withDetail("root_user", "Ismail")
                .withDetail("system_state", "healthy")
                .withDetail("metrics",metricsEndpoint)
                .build();
    }
}
