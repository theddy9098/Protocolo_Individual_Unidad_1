package org.example;

public class Main {
    public static void main(String[] args) {
        int[] Arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + " ");
        }

        System.out.println(" ");

        for (int i=0; i<Arreglo.length-1; i++) {
            if (Arreglo[i] < Arreglo[i + 1]) {
                desc = false;
            } else if (Arreglo[i] > Arreglo[i + 1]) {
                asc = false;

            }
        }
        if (asc) {
            System.out.println("El arreglo está en orden ascendente.");
        } else if (desc) {
            System.out.println("El arreglo está en orden descendente.");
        } else {
            System.out.println("El arreglo está desordenado.");
        }

        if (esAritmetica(Arreglo)) {
            System.out.println("El arreglo forma una progresión aritmética.");
        } else if (esGeometrica(Arreglo)) {
            System.out.println("El arreglo forma una progresión geométrica.");
        } else {
            System.out.println("El arreglo no forma ninguna progresión.");
        }
    }

    static boolean esAritmetica(int[] Arreglo) {
        if (Arreglo.length < 2) return false;
        int diferencia = Arreglo[1] - Arreglo[0];

        for (int i = 1; i < Arreglo.length - 1; i++) {
            if (Arreglo[i + 1] - Arreglo[i] != diferencia) {
                return false;
            }
        }
        return true;
    }

    static boolean esGeometrica(int[] Arreglo) {
        if (Arreglo.length < 2) return false;
        if (Arreglo[0] == 0) return false; // evitar división por cero
        double razon = (double) Arreglo[1] / Arreglo[0];

        for (int i = 1; i < Arreglo.length - 1; i++) {
            if (Arreglo[i] == 0 || (double) Arreglo[i + 1] / Arreglo[i] != razon) {
                return false;
            }
        }
        return false;
    }
}








