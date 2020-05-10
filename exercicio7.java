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
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // transformal meses em dias
         Scanner teclado = new Scanner (System.in);
        int meses, meses2;
        System.out.println("Informe quantos meses você quer converter em dias");
        meses= teclado.nextInt();
        meses2= meses*30;
        System.out.println("A quatidade aproximada de dias é:" +meses2);
    }
    
}
