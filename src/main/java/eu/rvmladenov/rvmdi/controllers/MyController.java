package eu.rvmladenov.rvmdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String Hello() {
        System.out.println("Hello from the method");

        return "Hello from the return method";
    }
}
