package com.a2.src.main.java.com.a2;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Pruebas manuales de CalculadoraNotas ===\n");

        // --- Varias notas ---
        System.out.println("Caso 1 — Varias notas: [6, 7, 8]");
        if (CalculadoraNotas.calcularMedia(new int[]{6, 7, 8}) != 7) {
            System.out.println("  ERROR: se esperaba 7");
        } else {
            System.out.println("  OK: resultado = 7.0");
        }

        // --- Varias notas con media decimal ---
        System.out.println("\nCaso 2 — Varias notas con decimal: [10, 9, 8, 7]");
        if (CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7}) != 8.5) {
            System.out.println("  ERROR: se esperaba 8.5");
        } else {
            System.out.println("  OK: resultado = 8.5");
        }

        // --- Una sola nota ---
        System.out.println("\nCaso 3 — Una sola nota: [5]");
        if (CalculadoraNotas.calcularMedia(new int[]{5}) != 5) {
            System.out.println("  ERROR: se esperaba 5");
        } else {
            System.out.println("  OK: resultado = 5.0");
        }

        // --- Lista vacía (debe lanzar excepción) ---
        System.out.println("\nCaso 4 — Lista vacía: []");
        try {
            CalculadoraNotas.calcularMedia(new int[]{});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        // --- Nota fuera de rango (debe lanzar excepción) ---
        System.out.println("\nCaso 5 — Nota fuera de rango: [5, 12]");
        try {
            CalculadoraNotas.calcularMedia(new int[]{5, 12});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        // --- Nota negativa (debe lanzar excepción) ---
        System.out.println("\nCaso 6 — Nota negativa: [-1, 5, 8]");
        try {
            CalculadoraNotas.calcularMedia(new int[]{-1, 5, 8});
            System.out.println("  ERROR: debería haber lanzado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("  OK: excepción capturada → " + e.getMessage());
        }

        System.out.println("\n=== Fin de las pruebas manuales ===");
    }
}