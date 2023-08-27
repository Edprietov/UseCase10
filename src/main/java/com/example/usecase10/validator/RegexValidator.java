package com.example.usecase10.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    public Boolean IsMatching(String string, Integer length) {
        string = string == null ? "" : string;

        length = (length == null || length == 0) ? 8 : length; // Default value if length is null or zero

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~])\\S{1," + length + "}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);

        return matcher.matches();
    }
}
