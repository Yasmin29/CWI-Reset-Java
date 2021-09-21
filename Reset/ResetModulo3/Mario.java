package ResetModulo3;

public class Mario extends Personagem {
    private Yoshi yoshi;

    //Método construtor
    public Mario(String nome, int idade, double altura) {
        super(nome,idade,altura);
    }

    @Override
    public void crescer() {
        altura = altura + (altura*0.5);
    }

    public void montarNoYoshi(Yoshi yoshi){
        this.yoshi = yoshi;
    }

    public void imprimiMarioMontadoYoshi () {
        if(this.yoshi != null){
            System.out.println("Mario está montado no yoshi");
        }else {
            System.out.println("Mario não está montado no yoshi");
        }
    }
}
