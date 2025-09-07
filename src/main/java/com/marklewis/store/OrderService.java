package com.marklewis.store;

public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService  paymentService){//Constructor function for class
//        //Injecting the PaymentService Object into the OrderService Class
//        //Dependency is the parameter for the constructor
//        //This definition of payment service is assigned the paymentService parameter from the Interface Payment Service
//        //This is how the interface methods "come into" the Order Service class.
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        //Now the paymentService variable holds (and implements) the processPayment because it was injected through
        //the constructor for the class.
        paymentService.processPayment( 10);

    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
