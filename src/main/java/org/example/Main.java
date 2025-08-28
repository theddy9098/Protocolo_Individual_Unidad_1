package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Numeros = new int[10];
        Random aleatorio = new Random();

        for (int i=0;i<Numeros.length; i++){
             Numeros[i] = aleatorio.nextInt(100);
        }

        for (int i:Numeros){
            System.out.println(i + "  ");
        }

        System.out.println("Ingresa el numnero a buscar");
        int BuscarValor = scanner.nextInt();

        int Pocision = -1;
        for (int i=0;i<Numeros.length; i ++){
            if (Numeros[i] == BuscarValor){
                Pocision = i;
                break;

            }
        }
        if (Pocision != -1) {
            System.out.println("El número " + BuscarValor + " está en la posición: " + Pocision);
        } else {
            System.out.println("El número " + BuscarValor + " no se encontró en el arreglo.");
        }

    }
}