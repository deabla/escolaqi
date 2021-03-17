/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioaula10;

import java.util.Arrays;

/**
 *
 * @author grazy
 */
public class Desafio2 {
    public static void main (String[] args) {

        //declaração dos vetores
        int[] numero = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] par = {2,4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] impar = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        //impressão de par
        System.out.println("Os numeros pares: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("São: " + par[i]);

        }
        
        //impressão de impar
        System.out.println("Os numeros impares: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("São: " + impar[i]);


        }
        
        //impressão de todos numeros
        
        System.out.println("Os numeros ao todo são: " + Arrays.toString(numero));
        
        //quantidade de par/impar
        System.out.println("Quantidade de numeros pares é : " + par.length);
        System.out.println("Quantidade de numeros impares é: " + impar.length);



    }

}
