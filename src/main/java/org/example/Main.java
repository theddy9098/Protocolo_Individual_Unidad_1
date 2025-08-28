package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
int [] numeros = new int[10];
Random aleatorio = new Random();

 for(int i=0;i<numeros.length;i++){
     numeros[i]=aleatorio.nextInt(100);
 }

    System.out.println("muestra los numeros en pantalla"+"\n");
    for (int i:numeros) {
    System.out.println(i + " ");
}
   for(int i=0;i<numeros.length;i++){
       if(numeros[i] % 2 != 0){
           numeros[i]= 0;
       }
   }
       System.out.println("Mostrar los impares cambiados por 0");
       for (int i:numeros) {
           System.out.println(i + " ");
       }


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * i;
        }

        System.out.println("Después de multiplicar por su índice:");
        for (int i : numeros) {
            System.out.print(i + " ");
        }

    }
}