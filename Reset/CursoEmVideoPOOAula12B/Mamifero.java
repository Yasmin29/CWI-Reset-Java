package CursoEmVideoPOOAula12B;

public class Mamifero extends Animal{

    //Atributos:
    private String corPelo;

    //Métodos sobrepostos:
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    //Métodos especiais:
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
