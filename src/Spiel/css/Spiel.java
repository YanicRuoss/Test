package Spiel.css;
import java.util.Random;
import java.util.Scanner;

public class Spiel {

    public static void main(String[] args) {

        int zufallszahl, eingabe1, Rateversuch;
        Scanner eingabe = new Scanner(System.in);
        zufallszahl = ((int) (Math.random()*30))+1;
        Rateversuch = 0;
        System.out.println("Errate eine Zahl zwischen 1 und 30");
        do {

            Rateversuch++;
            System.out.print(Rateversuch + ". Rateversuch: ");
            eingabe1 = Integer.valueOf(eingabe.next());
            if(eingabe1 < zufallszahl) System.out.println("Die Zahl ist groesser");
            if(eingabe1 > zufallszahl) System.out.println("Die Zahl ist kleiner");

                if (eingabe1 == zufallszahl) {System.out.println("Zahl erraten!");
                System.exit(0);
            }
        } while(Rateversuch <= 8);
        System.out.println("Try it next Time!");
    }
}
