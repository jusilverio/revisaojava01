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
public class aula1105exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercício 1
        Scanner teclado = new Scanner (System.in);
        String nomeUsuario;
        int  nota1, nota2;
        System.out.println("Digite seu nome");
        nomeUsuario= teclado.next();
        System.out.println("digite sua primeira nota");
        nota1= teclado.nextInt();
        System.out.println("digite sua segunda nota");
        nota2= teclado.nextInt();
        if (nota1+nota2/2>=6) {
            System.out.println("Aprovado!");
        }else{System.out.println("Recuperação!");
            if (nota1+nota2/2<=4) {
                System.out.println("Reprovado!");
            }
   
            }
        }
                
        
        }
