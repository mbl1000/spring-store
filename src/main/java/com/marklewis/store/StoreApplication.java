package com.marklewis.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=gJrjgg1KVL4// Link for reference*******************************


        //run returns a type of application context, our IOC container. The IOC container stores the objects.
        //It stores the return in a sprint ApplicationContext type.  Here we name the Application Context "context"
        //The context comes with its own built in methods managed by spring.
        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
        //A bean is an object in spring that is injected and has its life cycle managed by spring
        var orderService = context.getBean(OrderService.class);


        //Assign a variable with the OrderService class functions and provide Order Service with the chosen dependency
        //Both of these dependencies are implemented by the interface and perform processPayment() because they
        //implement the interface.  Inside the OrderService class is where the code states to use the dependency choice
        //to process the payment
        //var orderService = new OrderService(new StripePaymentService());

        //var orderService = new OrderService(new PayPalPaymentService());  Now managed by spring when define
        // orderservice above
        orderService.placeOrder();
    }
}
