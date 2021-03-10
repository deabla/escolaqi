package biblioteca1;

/**
 *
 * @author grazy
 */

public class Livro {
    String titulo;
    String autor;
    int ano;    
    private int data;
    private int aluguel = 2;

    public double getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public int getAluguel() {
        return aluguel;
    }
    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }  
    
    //verifica a quantidades de dias a ser alugado e retorna o valor do aluguel
    public int calcDiasAlugado()
    {
        switch(data)
        {
            case 1:
                System.out.println("1 dia: " + aluguel);
                break;
            case 2:
                System.out.println("2 dias: " + (aluguel * 2));
                break;
            case 3:
                System.out.println("3 dias: " + (aluguel * 3));
                break;            
            default:
                if(data <= 0 && data > 3 )
                {
                    data = 2 * data;
                }  
        }
        return data;
    }
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Título: " + this.titulo + "\n"
                + "Autor: " + this.autor + "\n"
                + "Ano: " + this.ano + "\n"
                + "Dias a ser alugado: " +  this.data + "\n"
                + "Aluguel: R$" + this.aluguel + "\n";
    }
    
    }
