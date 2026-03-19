package com.a2;

public class Main {
    public static void main(String[] args) {

        // prueba con varias notas
        double resultado = CalculadoraNotas.calcularMedia(new int[]{6, 7, 8});
        System.out.println("media de [6,7,8]: " + resultado);

        // prueba con decimal
        resultado = CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7});
        System.out.println("media de [10,9,8,7]: " + resultado);

        // una sola nota
        resultado = CalculadoraNotas.calcularMedia(new int[]{5});
        System.out.println("media de [5]: " + resultado);

        // lista vacia, deberia dar error
        try {
            CalculadoraNotas.calcularMedia(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("error lista vacia: " + e.getMessage());
        }

        // nota fuera de rango
        try {
            CalculadoraNotas.calcularMedia(new int[]{5, 12});
        } catch (IllegalArgumentException e) {
            System.out.println("error nota fuera de rango: " + e.getMessage());
        }
    }
}