package com.example.usecase10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StringValidatorController {

    private RegexValidator regexValidator = new RegexValidator();
    @GetMapping("/stringValidator")
    public String validate(@RequestParam(value = "string") String name, @RequestParam(value = "length") Integer length) {
        return regexValidator.IsMatching(name, length) ? "Valid" : "Invalid";
    }
}


