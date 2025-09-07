package com.marklewis.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=gJrjgg1KVL4// Link for reference*******************************

        //SpringApplication.run(StoreApplication.class, args);
        //Assign a variable with the OrderService class functions and provide Order Service with the chosen dependency
        //Both of these dependencies are implemented by the interface and perform processPayment() because they
        //implement the interface.  Inside the OrderService class is where the code states to use the dependency choice
        //to process the payment
        //var orderService = new OrderService(new StripePaymentService());

        var orderService = new OrderService();
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }
}
