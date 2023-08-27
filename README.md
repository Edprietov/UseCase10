# UseCase10

Repository that contains all steps required in scope of this task, for productivity using AI generative

## Application Description

It is a single web endpoint that allows you to verify if a given string matches some rules that will be mentioned in the next section.
As parameters, the endpoint should receive a string and a maximum length. The endpoint should return a text indicating if the string matches
or not.

## Regex Implementation

The regular expression follows next rules:

• This regular expression should validate the maximum string length (passed as parameter); it should return a match if the string length is
within the acceptable range and a non-match if it is not.
• This regular expression should also validate that the string contains at least one uppercase letter, one lowercase letter, one digit, and
one special character from a predefined list: !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~. It should return a match if the criteria are met and a
non-match if they are not.
• This regular expression should validate that the string does not contain any whitespace characters (spaces, tabs, or newlines). This
should return a non-match if any whitespace characters are found.

## How to run the application

1. Clone the repository
2. Open the project in your IDE
3. Run the application (It will be listening on port 8080)
4. Make get request to http://localhost:8080/stringValidator, passing as query params the string that will be validated and the max length.
5. You will get a response indicating if the string matches or not given conditions
