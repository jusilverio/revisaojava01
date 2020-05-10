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
public class exercicios1e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercício1
        String nomeUsuario;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Olá, informe seu nome");
        nomeUsuario = teclado.next();
        System.out.println("Olá "+nomeUsuario+" ,seja bem vindo!");
        
        //exercício2
        int numero1, numero2,numero3, numero4, resultadomedia;
        System.out.println("digite a primeira nota");
        numero1= teclado.nextInt();
        System.out.println("digite a segunda nota");
        numero2= teclado.nextInt();
        System.out.println("digite a terceira nota");
        numero3= teclado.nextInt();
        System.out.println("digite a quarta nota");
        numero4= teclado.nextInt();
        resultadomedia= numero1+numero2+numero3+numero4;
        resultadomedia= resultadomedia/4;
        System.out.println("sua média é: "+resultadomedia);
        
    }
    
}
