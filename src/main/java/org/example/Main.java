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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += Matriz[i][j];

            }


        }

        System.out.println("El resultado de la suma de la matriz es: " + suma);

        //Variable donde se almacena la primera fila de la matriz y donde se remplaza por la ultima
        int[] temp = Matriz[0];
        Matriz[0] = Matriz[Matriz.length - 1];
        Matriz[Matriz.length - 1] = temp;

        System.out.println("Matriz después de intercambiar la primera fila con la última:");
        imprimirMatriz(Matriz);

    }
     // Metodo necesario para imprimir la matriz cambiada
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

}