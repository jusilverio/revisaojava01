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
public class aula1105exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercício 1
       
        Scanner teclado = new Scanner (System.in);
        int  ano;
        System.out.println("Digite o ano");
        ano= teclado.nextInt();
        if (ano<=2019) {
            System.out.println("Ano passado");
        }else{System.out.println("Ano atual");
            if (ano>=2021) {
                System.out.println("Ano futuro");
            }
   
            }
        }
                
        
        }