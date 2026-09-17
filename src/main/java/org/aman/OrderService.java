package org.aman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// By default `Scope` is **singleton**
public class OrderService {

    private final PaymentService paymentService;

    // here, a proxy of paymentService is created at the time of OrderService creation
    // the actual object is injected only when there is any kind of operation performed on paymentService
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
