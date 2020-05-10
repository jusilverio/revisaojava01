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
public class aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipo,nome,valor
        //int- numeros inteiros, string-palavras, double-numeros quebrados
        //crie uma variave chamada numero do tipo inteira com valor 10
        int número = 10;
        //crie uma variavel chamada nome que armazene o seu nome
        String nome = "julia";
       //para imprimir escrever sout e apertar tab
        System.out.println("Olá meu nome é " + nome +" e o valor da variavel é:" +número);
        //apertar botão direito e run file
        //chamar uma variavel é chamado de concatenação
        
        //operações matemáticas
        //soma, divisão, subtração,multiplicação
        int resultado;
        int a = 10;
        int b = 5;
        //soma
        resultado = a+b;
        System.out.println("A soma de a e b resulta em: " +resultado);
        //divisão o simbolo é a /
        resultado = a/b;
        System.out.println("A divisão resulta em: " +resultado);
        //subtração
        resultado = a-b;
        System.out.println("A subtração de a menos b resukta em: " +resultado);
        //multiplicação o simbolo é *
        resultado = a*b;
        System.out.println("A multiplicação de a por b resulta em: " +resultado);
        //terefa do vídeo
        //criar uma variavel do tipo double 
        //diderença de double pra float = possui o dobro da capacidade de uma variavel tipo floart.
        
        // usando a classe scanner
        //o usuário digite o nome na tela e mostrar na tela
        String nomeUsuario;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Olá, informe seu nome");
        nomeUsuario = teclado.next();
        System.out.println("Olá seu nome é: "+nomeUsuario);
        //somar dois numeros digitados pelo usuario
        int numero1, numero2, resultadoSoma;
        System.out.println("digite o primeiro numero");
        numero1= teclado.nextInt();
        System.out.println("digite o segundo numero");
        numero2= teclado.nextInt();
        resultadoSoma = numero1+numero2;
        System.out.println("a soma dos seus números é "+resultadoSoma);
        
        
        
        
        
    }
    
}