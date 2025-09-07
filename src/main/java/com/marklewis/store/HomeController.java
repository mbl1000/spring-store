package com.marklewis.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller; // Defines the controller in this package
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//Annotations give more context to the compiler to say this class is a controller directing traffic.
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")//Allows requests to go to the root of our website.
    // The argument for annotation guides the path
    public String index(){
        System.out.println("appName: "+appName);
        //Return the name of the view that should be returned to the browser

        //Render index.html view file to browser
        return "index.html";
    }


}
