package org.aman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
//        OrderService orderService1 = context.getBean(OrderService.class);
//
//        System.out.println(orderService ==  orderService1); // true
//
//        PaymentService paymentService = context.getBean(PaymentService.class);
//        PaymentService paymentService1 = context.getBean(PaymentService.class);
//
//        System.out.println(paymentService ==  paymentService1); // false
    }
}