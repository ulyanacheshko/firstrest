package com.firstrest.firstrest.controller;

import com.firstrest.firstrest.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculateTwoInt")
public class MessageController {
    @GetMapping("+/{num1}/{num2}")
    public Integer Plus(@PathVariable Integer num1, @PathVariable Integer num2) {
        Integer result = num1 + num2;
        return result;
    }
    @GetMapping("-/{num1}/{num2}")
    public Integer Minus(@PathVariable Integer num1, @PathVariable Integer num2) {
        Integer result = num2 - num1;
        return result;
    }

    @GetMapping("*/{num1}/{num2}")
    public Integer Multiply(@PathVariable Integer num1, @PathVariable Integer num2) {
       Integer result = num1 * num2;
        return result;
    }

    @GetMapping(":/{num1}/{num2}")
    public Integer Divide(@PathVariable Integer num1, @PathVariable Integer num2) {
        if(num1.equals(0)){return 0;}
        Integer result = num2 / num1;
        return result;
    }
}