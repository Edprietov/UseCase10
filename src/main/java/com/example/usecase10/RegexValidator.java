package com.example.usecase10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JacksonInject;

public class RegexValidator {

    public Boolean IsMatching(String string, Integer length) {

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~])\\S{1," + length + "}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);

        return matcher.matches();
    }
}
