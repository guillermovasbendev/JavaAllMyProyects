/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje4ventacarros;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje4VentaCarros {

    public static void main(String[] args) {
        /*Una compañia de venta de carros usados, paga a su personal de ventas un salario
        de $1000 mensuales, mas una comision de $150 por cada carro vendido, mas el 5% del
        valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la 
        computadora los datos pertinentes. Hacer un programa que calcule e imprima 
        el salario mensual de un vendedor dado
        */
        // salarioMensual =$1000
        // autosVendidosxMes = Cantidad de autos vendidos por Mes
        // comisionDe5= 5% del valor de cada auto
        //comisionxUnidadVendida = el 150% por auto vendido

        Scanner entrada = new Scanner(System.in);

        final double salarioMensual = 1000.0;
        final double comisionPorCarro = 150.0;

        System.out.println("Ingrese la cantidad de autos vendidos por el empleado en el mes: ");
        int autosVendidosxMes = entrada.nextInt();

        System.out.println("Ingrese el valor de cada auto: ");
        double valorDeCadaAuto = entrada.nextDouble();

        double comisionPorCarros = comisionPorCarro * autosVendidosxMes; // Comisión por carros vendidos
        double comisionPorVenta = (valorDeCadaAuto * autosVendidosxMes * 5) / 100; // 5% del valor total de ventas

        double totalSalario = salarioMensual + comisionPorCarros + comisionPorVenta;

        System.out.println("El valor del salario mensual sin comisiones es: $" + salarioMensual);
        System.out.println("La comisión total por carros vendidos es: $" + comisionPorCarros);
        System.out.println("La comisión del 5% sobre el valor de venta por carro es: $" + comisionPorVenta);
        System.out.println("El salario total del empleado vendedor es: $" + totalSalario);
    }
}
