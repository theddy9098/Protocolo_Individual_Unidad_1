package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
int [] numeros = new int[10];
Random aleatorio = new Random();

for (int i = 0; i < numeros.length; i++) {
    numeros[i] = aleatorio.nextInt(100) + 1;
}
        System.out.println("Arreglo iniciado con numeros aleatorios");
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}

    }
}