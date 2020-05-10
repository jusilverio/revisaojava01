/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0405;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // area de um quadrado
        Scanner teclado = new Scanner (System.in);
        int lado1, lado2, lado3;
        System.out.println("Informe o valor do lado");
        lado1= teclado.nextInt();
        System.out.println("Informe o valor do lado");
        lado2= teclado.nextInt();
        lado3 = lado1 * lado2;
        System.out.println("A área do quadrado é:" +lado3);
        
    }
    
}
