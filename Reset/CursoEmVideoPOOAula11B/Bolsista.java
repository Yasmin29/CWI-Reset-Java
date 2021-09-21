package CursoEmVideoPOOAula11B;

public class Bolsista extends Aluno {
   //Atributos:
    private double bolsa;

    //Métodos:
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de: " + getNome());

    }


    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista! Pagamento Facilitado");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
