package Rechner.css;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String Form = sc.nextLine();

        String[] Body = {"Kreis", "Quadrat", "Dreieck"};
        System.out.println("Wähle einen Körper");
        System.out.println("Kreis");
        System.out.println("Quadrat");
        System.out.println("dreieck");
        String Forms = sc.nextLine();
        if (Forms == Body[0]) ;
        System.out.println("Was für eine Kreis Berechnung soll gemacht werden?");
        System.out.println("Fläche");
        System.out.println("Volumen");
        String Berechnung = sc.nextLine();
        if (Berechnung == "Fläche") ;
    }
}