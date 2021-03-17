/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioaula10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author grazy
 */
       public class Desafio1 {
      public static void main(String[] args) {
          
    Scanner leia = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();
    int numero, numeros, menu, qtd = 0, soma = 0;
    

    do {
       
        System.out.println(" __________________________________________");
        System.out.println("|               MENUZINHO                  |");
        System.out.println("| 1- Adicionar número                      |");
        System.out.println("| 2- Valor de vezes                        |");
        System.out.println("| 0- Sair                                  |");
        System.out.println("|__________________________________________|");
        System.out.println("Escolha uma opção: ");
        menu = leia.nextInt();

      switch (menu) {
            case 1:          
                System.out.print("Digite um número: ");
                numeros = leia.nextInt();
                nums.add(numeros);
                System.out.println(numeros + " adicionado com sucesso !");
            break;
            case 2:
                System.out.print("Digite o numero que você deseja consultar: ");
                numero = leia.nextInt();
                System.out.println(numero + " adicionado com sucesso !");
          
                //quantidade
                for (int i = 0; i < nums.size(); i++) {
                  if( nums.get(i).equals(numero)){
                    qtd = qtd + 1;
                  }
                }     
                
                //soma
                  
                for (Integer integer : nums) {
                soma += integer;
        }
          System.out.println(" ____________________________");
          System.out.println("│        RESULTADOS         │");
          System.out.println("│___________________________│");
          System.out.println("│Quantidade: "+ qtd + "              │");
          System.out.println("│Soma: " + soma + "                   │");
          System.out.println("│___________________________│");

          break;
     

        default:
          System.out.println("\nOpção inválida\n"
                  + "Digite novamente\n");
      }

    } while (menu > 0);

  }

}
