package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci i seguenti paramentri");

        System.out.println("Nome");
        String name = in.nextLine();

        System.out.println("Cognome");
        String surname = in.nextLine();

        System.out.println("Colore preferito");
        String color = in.nextLine();

        System.out.println("Giorno di nascita");
        int birthDay = in.nextInt();

        System.out.println("Mese di nascita");
        int birthMonth = in.nextInt();

        System.out.println("Anno di nascita");
        int birthYear = in.nextInt();
        in.close();

        String password = name + "-" + surname + "-" + color + "-" + (birthDay + birthMonth + birthYear);
        System.out.println("La tua password è: " + password);
    }
}
