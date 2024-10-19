package com.example.demo.flower.controller;

import com.example.demo.DemoApplication;
import com.example.demo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlowerController {
    @RequestMapping("/controller")
    public String control() {
        StringBuilder resultingMessage = new StringBuilder();
        for (Order ord : DemoApplication.listFlowers()) {
            resultingMessage.append(ord.processOrder()).append('\n');

        }
        return resultingMessage.toString();
    }
}