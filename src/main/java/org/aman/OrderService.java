package org.aman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// By default `Scope` is **singleton**
public class OrderService {

    public OrderService() {
        System.out.println("OrderService created");
    }

    public void placeOrder() {
        System.out.println("Order Placed");
    }
}
