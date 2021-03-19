package exercicioOnze;

/**
 *
 * @author grazy
 */
public class Mosca {
 
    int qtdPatas;
    String especie;
    
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Quantidade de Patas: " + this.qtdPatas + "\n"
                + "Espécie: " + this.especie + " anos\n";
    }
}
