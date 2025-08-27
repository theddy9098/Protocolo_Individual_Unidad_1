package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
int [] numeros = new int[10];
Random aleatorio = new Random();

 for(int i=0;i<numeros.length;i++){
     numeros[i]=aleatorio.nextInt(100);
 }

    System.out.println("muestra los numeros en pantalla");
    for (int i:numeros) {
    System.out.println(i);
            
}

    }
}