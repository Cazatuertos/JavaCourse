package com.example.demo.Repository;

import java.util.Scanner;

public class SepararFraseApp {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("Escribe una frase");
        String frase = sn.next();

        //Divido la frase en palabras
        String palabras[] = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}

