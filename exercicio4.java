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
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calcular tamanho de um triangulo apatir da formula
         Scanner teclado = new Scanner (System.in);
        int area, base, altura;
        System.out.println("Informe o valor da base");
        base= teclado.nextInt();
        System.out.println("Informe o valor da altura");
        altura= teclado.nextInt();
        area= base*altura/2;
        System.out.println("O valor da área é:" +area);
        
        
        
    }
    
}
