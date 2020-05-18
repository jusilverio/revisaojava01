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
public class aula1105exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercício 1
        Scanner entr = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("digite um número");

        numero1 = entr.nextInt();

        numero2 = numero1 % 2;

        if (numero2 == 0) {

           System.out.println( +numero1+ " é um número par");

        }else{

            System.out.println( +numero1+ " não é um número par");
            }
   
            }
        }
                
        
        }
    
    

