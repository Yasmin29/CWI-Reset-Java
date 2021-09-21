package ResetModulo3;

public class Luigi extends Personagem {

    //Método construtor
    public Luigi(String nome, int idade, double altura){
        super(nome,idade,altura);
    }

    //Método:
    public void voar(){
        System.out.println("Luigi está voando");
    }

    @Override
    public void crescer() {
        altura = altura + (altura*0.75);
    }
}
