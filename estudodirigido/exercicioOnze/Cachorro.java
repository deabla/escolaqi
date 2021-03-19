package exercicioOnze;

/**
 *
 * @author grazy
 */
public class Cachorro {
    
    String corPelo;
    String especie;
    
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Cor do pelo: " + this.corPelo + "\n"
                + "Espécie: " + this.especie + " anos\n";
    }
}
