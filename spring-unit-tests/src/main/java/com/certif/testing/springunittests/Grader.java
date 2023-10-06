package com.certif.testing.springunittests;

public class Grader {
    public String grade(int number) {

        if (number >= 0 && number <= 5) {
            return "Low effort";
        } else if (number > 5 && number <= 10) {
            return "You can do it, just make some effort";
        } else if (number > 10 && number <= 15) {
            return "Nice job! you can do more.";
        } else if (number > 15 && number <= 20) {
            return "You are amazing!";
        } else {
            throw new IllegalArgumentException("The grade should be in this interval: [0, 20]");
        }

    }
}
