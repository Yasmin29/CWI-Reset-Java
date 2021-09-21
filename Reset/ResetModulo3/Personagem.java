package ResetModulo3;

import java.math.BigDecimal;

public abstract class Personagem {

    //Atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private int estamina;
    protected double altura; //para que suas filhas possam usar a altura
    private int moedas;
    private int vidas;

    //Construtor:
    public Personagem(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.nacionalidade = "Italiano";
        this.moedas = (0);
        this.vidas = (1);

    }

    //Métodos:
    public abstract void crescer();

    public void perdeEstamina(){
        if(this.estamina > 0){
            this.estamina = estamina - 10;
        }else{
            this.estamina = 0;
        }
    }

    public void ganharEstamina(){
        if (this.estamina < 100) {
            this.estamina = estamina + 5;
        }else{
            this.estamina = 100;
        }
    }

    public void revigorar (){
        this.estamina = 100;
    }

    public void morrer() {
        this.estamina = 0;
        this.vidas -= 1;

        if(vidas >= 0) {
           revigorar();  // cada vez que perder uma vida, o mario revigora
        }else{
            vidas = 0;
        }
    }

    public void coletarMoedas() {
        this.moedas += 1;

        if(this.moedas % 10 == 0){
            vidas += 1;
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Estamina: " + estamina );
        System.out.println("Vidas: " + vidas);
        System.out.println( "Moedas: " + moedas);

    }

    public void imprimirStatus() {
        System.out.println("Altura: " + altura);
        System.out.println("Vidas: " + vidas);
        System.out.println("Estamina: " + estamina);
        System.out.println("Moedas: " + moedas);
    }

    public void imprimirPoderes() {
        System.out.println("Pirocinese,Sobrevivência sobrenatural,Motorista experiente");
    }

    public void saltar(){
//        System.out.println(this.nome + " saltou de uma altura de " + BigDecimal.valueOf(this.altura*0.5).setScale(2, BigDecimal.ROUND_DOWN));

        System.out.printf(this.nome + " saltou de uma altura de %.2f" + "\n", this.altura*0.5);
    }

    public void saltar(double objeto){
        System.out.println("Altura do objeto: " + objeto);
        double salto;
        salto = objeto + (objeto * 0.5);
        System.out.println(this.nome + " saltou a uma altura de: " + salto);
    }

}
