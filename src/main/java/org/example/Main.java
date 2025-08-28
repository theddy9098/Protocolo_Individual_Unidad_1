package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] Matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int j = 0; j < 3; j++) {   //con esto recorremos la matriz en forma de colomnas
            for (int i = 0; i < 3; i++) {
                System.out.print(Matriz[i][j] + " ");
            }

            // Aqui imprimimos en forma de tabla
            System.out.println();


        }
    }
}