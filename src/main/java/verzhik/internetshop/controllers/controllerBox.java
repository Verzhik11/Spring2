package verzhik.internetshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerBox {
    @GetMapping
    public String start() {
        return "Hello";
    }
}
