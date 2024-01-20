/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formulanumeroaleatorioenrango;

/**
 *
 * @author GUILLERMO
 */
public class FormulaNumeroAleatorioEnRango {

    public static void main(String[] args) {
        double numeroAleatorio = Math.random();
        // Se puede escalar el numero con la siguiente formula:
        //Asignando valores de maximo y minimo en variables
        int min = 1; // Valor mínimo del rango
        int max = 100; // Valor máximo del rango

        // Fórmula para escalar el número aleatorio al rango deseado
        int numeroEnRango = (int) (numeroAleatorio * (max - min + 1)) + min;

        // Mostrar el número aleatorio en el rango específico
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroEnRango);
    }
}
