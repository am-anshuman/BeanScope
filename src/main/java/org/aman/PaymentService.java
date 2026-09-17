package org.aman;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService created");
    }

    public void pay() {
        System.out.println("Payment done");
    }
}
