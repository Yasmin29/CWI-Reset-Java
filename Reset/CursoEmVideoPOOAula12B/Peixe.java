package CursoEmVideoPOOAula12B;

public class Peixe extends Animal{

    //Atributos:
    public String corEscama;

    //Métodos:
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }

    //Métodos sobrepostos:
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não produz som");

    }

    //Métodos especiais:
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
