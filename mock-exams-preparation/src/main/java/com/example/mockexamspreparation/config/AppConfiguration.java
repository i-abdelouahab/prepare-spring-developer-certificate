package com.example.mockexamspreparation.config;

import com.example.mockexamspreparation.pojos.Driver;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    private final ApplicationContext applicationContext;
    private final InitializingBean initializingBean;

    public AppConfiguration(ApplicationContext applicationContext, InitializingBean initializingBean) {
        this.applicationContext = applicationContext;
        this.initializingBean = initializingBean;
    }

    @Bean
    public Driver driver() {
        return new Driver();
    }
    @PostConstruct
    public void init() throws Exception {
        var driver = applicationContext.getBean(Driver.class);
        driver.setName("Ismail");
        driver.setAge(23);
        System.out.println(driver.toString());
        initializingBean.afterPropertiesSet();
    }
}
