package ResetModulo3;

public class Yoshi extends Personagem{
    private int frutasComidas;
    private int velocidade;

    //Construtor
    public Yoshi(String nome, int idade, double altura){
        super(nome,idade,altura);
        frutasComidas = 0;
        velocidade = 10;
    }

    //Métodos
    public void comerFrutas(){
        this.frutasComidas ++;
        if(this.frutasComidas % 2 == 0) {
            this.velocidade *= 2;
        }
    }


    //Métodos especiais
    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public void crescer(){
        altura = altura + (altura*0.10);
    }
}
