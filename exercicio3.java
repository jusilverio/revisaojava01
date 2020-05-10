/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0405;

import java.util.Scanner;

/**
 *
 * @author zete
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exercício 3
       // crie um programa que exiba a tabuada de um número informado pelo usuário
       String nomeUsuario;
        Scanner teclado = new Scanner (System.in);
      
        int numero1,tabuada, tabuada1, tabuada2,tabuada3, tabuada4, tabuada5, tabuada6, tabuada7, tabuada8, tabuada9, tabuada10;
        System.out.println("Informe o número");
        numero1= teclado.nextInt();
        tabuada1= numero1*1;
        tabuada2= numero1*2;
        tabuada3= numero1*3;
        tabuada4= numero1*4;
        tabuada5= numero1*5;
        tabuada6= numero1*6;
        tabuada7= numero1*7;
        tabuada8= numero1*8;
        tabuada9= numero1*9;
        tabuada10= numero1*10;
        System.out.println("5*1 "+tabuada1+ " 5*2 "+tabuada2+ " 5*3 "+tabuada3+ " 5*4 " +tabuada4+" 5*5 " +tabuada5+" 5*6 " +tabuada6+" 5*7 "+tabuada7+" 5*8 "+tabuada8+" 5*9 "+tabuada9+" 5*10 "+tabuada10);
        
    }
    
}
