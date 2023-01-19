package ClassCode;

import java.util.Scanner;

public class MyClassCode {

    public static void main (String [] args) {

        final String user = greetUser("Mosh", "Hamedani");
        System.out.println(user);

    }
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }

    }