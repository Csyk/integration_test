package com.codecool;

import org.junit.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by csyk on 2017.04.04..
 */
@Configuration
public class TestConfig {

    @Bean
    Controller controller(){
        return new Controller();
    }
}
