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
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calcular indice de massa corporal
        Scanner teclado = new Scanner (System.in);
        int imc, peso, altura;
        System.out.println("Informe seu pedo em kilogramas");
        peso= teclado.nextInt();
        System.out.println("Informe sua altura em metros");
        altura= teclado.nextInt();
        imc= peso/altura*altura;
        System.out.println("Seu IMC é:" +imc);
        
    }
    
}
