package org.aman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    // For **singleton** scoped beans, per bean definition a new object is created.

    // Here, there are two bean definitions, so two different beans will be created
    @Bean
    public OrderService getOrderService() {
        return new OrderService();
    }

    @Bean
    public OrderService getOrderService2() {
        return new OrderService();
    }
}
