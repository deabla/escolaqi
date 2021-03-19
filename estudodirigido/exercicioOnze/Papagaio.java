package exercicioOnze;

/**
 *
 * @author grazy
 */
public class Papagaio {
    
    String corPena;
    String especie;
    
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Cor das Penas: " + this.corPena + "\n"
                + "Espécie: " + this.especie + " anos\n";
    }
}
