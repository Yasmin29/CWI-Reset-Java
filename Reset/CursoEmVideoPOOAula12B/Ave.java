package CursoEmVideoPOOAula12B;

import javax.crypto.spec.PSource;

public class Ave extends Animal {
    //Atributos:
    private String corPena;

    //Métodos sobrepostos:
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");

    }

    //Métodos:
    public void fazerNinho(){
        System.out.println("Contruindo ninho");
    }

    //Métodos especiais:
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
