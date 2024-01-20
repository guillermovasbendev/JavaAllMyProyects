/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasemath;

/**
 *
 * @author GUILLERMO
 */
public class ClaseMath {

    public static void main(String[] args) {
        //raiz cuadrada
        
        //la raiz siempre debe ser un dato de tipo double
        double raiz=Math.sqrt(16);
        System.out.println(raiz);
        //si se quiere sacar raiz a un entero 
        int raiz2 =(int)Math.sqrt(9);//usar el prefijo (int) hace que se acepte 
        //un dato diferente a double y el resultado de la raiz sea un entero
        System.out.println(raiz2);
        
        //Potencia
        double base=3,exponente=3;
        //Math.pow(base, base)
        double resultado=Math.pow(base,exponente);
        System.out.println(resultado);
        
        //Redondear un numero
        double numero=32.27;
        var resultado2=(long)Math.round(numero);
        System.out.println("Para redondiar un doble se debe pasar un dato tipo long");
        System.out.println("Tambien puedes redondear un float con f, pero debes pasar un dato tipo int");
        System.out.println("los dos metodos aparecen en la ayuda cuando se usa roun al final dice que tipo de dato pasar");
        System.out.println("");
        System.out.println("el redondeo de numero es: " + resultado2);
        
        // Random Generar un número aleatorio entre 0 y 1
        double numeroAleatorio = Math.random();
        System.out.println("el numero aleatorio es: " + numeroAleatorio);


    
        
    }
}
