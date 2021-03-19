package exercicioOnze;

/**
 *
 * @author grazy
 */

    import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();
        
         int menu;
    

    do {
       
        System.out.println(" __________________________________________");
        System.out.println("|               MENUZINHO                  |");
        System.out.println("| 1- Papagaio                              |");
        System.out.println("| 2- Cachorro                              |");
        System.out.println("| 3- Mosca                                 |");
        System.out.println("| 0- Sair                                  |");
        System.out.println("|__________________________________________|");
        System.out.println("Escolha uma opção: ");
        menu = ler.nextInt();

      switch (menu) {
            case 1:          
                System.out.println("Digite a cor das penas do papagaio: ");
                p1.corPena = ler.nextLine();
                System.out.println("Digite a espécie: ");
                p1.especie = ler.nextLine();
            break;
            case 2:
                System.out.println("Digite a cor do pelo do cachorro: ");
                c1.corPelo = ler.nextLine();
                System.out.println("Digite a espécie: ");
                c1.especie = ler.nextLine();
            break;
            case 3:
                System.out.println("Digite a quantidade de patas: ");
                m1.qtdPatas = ler.nextInt();
                System.out.println("Digite a espécie: ");
                m1.especie = ler.nextLine();
            break;
            case 8:
                System.out.println("== Sair do programa ==");
            break;

            default:
                System.out.println("Opção de menu errada ! \n"
                            + "Tente novamente !");
     }

        } while (menu != 8);

    }
}