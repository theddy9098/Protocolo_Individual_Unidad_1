package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] Matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }


        int suma = 0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                suma += Matriz[i][j] ;

            }


        }
        System.out.println("El resultado de la suma de la matriz es: " + suma);
    }
}