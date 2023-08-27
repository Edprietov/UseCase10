package com.example.usecase10.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.usecase10.dto.Result;
import com.example.usecase10.validator.RegexValidator;

@RestController
public class StringValidatorController {

    private RegexValidator regexValidator = new RegexValidator();

    @GetMapping("/stringValidator")
    public Result validate(@RequestParam(value = "string") String string, @RequestParam(value = "length") Integer length) {
        return new Result(regexValidator.IsMatching(string, length) ? "This string matches the regular expression" :
            "This string does not match given regular expression");
    }
}


