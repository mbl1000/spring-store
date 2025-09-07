package com.marklewis.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //This tells spring to manage types of order service
//Depending on the purpose we may have @Component, @Service if it is for classes containing
// business purposes, @Repository if interacting with a database, and @Controller to tell Spring class is a Controller
// for Http
//@Component is a general purpose annotation and @Service is an alias for @Component

public class OrderService {

    private PaymentService paymentService;

//    @Autowired
    //In previous spring versions @Autowired was required to tell spring to load OrderService with its dependencies.
    //However it is no longer needed as long as the class has a single constructor
    public OrderService(PaymentService  paymentService){//Constructor function for class
        //Injecting the PaymentService Object into the OrderService Class
        //Dependency is the parameter for the constructor
        //This definition of payment service is assigned the paymentService parameter from the Interface Payment Service
        //This is how the interface methods "come into" the Order Service class.
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        //Now the paymentService variable holds (and implements) the processPayment because it was injected through
        //the constructor for the class.
        paymentService.processPayment( 10);

    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
