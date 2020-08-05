package ch.css;

import java.lang.management.MonitorInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String username = "Dominik";
        if (username == "Dominik") {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your password: ");
            //enteredPassword = input.nextLine();
            //Checker tc = new Checker(enteredPassword);
            //tc.checkSecurity();
        } else {
            System.out.println("Error");
        }

        String passwort = "HelloWorld";

        if (passwort == passwort) {
            System.out.println("Eingeloggt");
        } else {
            System.out.println("Wrong Passwort:");
        }


    }
}
