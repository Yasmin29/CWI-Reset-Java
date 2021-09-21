package ResetModulo3;

import java.util.Random;

public class Jogo {
    private Personagem jogador1;
    private Personagem jogador2;

    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void imprimirDadosPersonagens(){
        System.out.println("-------------------JOGADOR 1-------------------");
        jogador1.imprimirDados();
        System.out.println("-------------------JOGADOR 2-------------------");
        jogador2.imprimirDados();
    }

    public void jogar(){
        Random aleatorio = new Random();

        int vezesDeColetarMoedas1 = aleatorio.nextInt (31);

        for(int i=0; i<vezesDeColetarMoedas1; i++) {
            jogador1.coletarMoedas();
        }

        int vezesDeColetarMoedas2 = aleatorio.nextInt(31);
        for(int i =0; i<vezesDeColetarMoedas2; i++){
            jogador2.coletarMoedas();
        }

        System.out.println("Quantidade de vezes da coleta de moedas do jogador um: " + vezesDeColetarMoedas1);
        System.out.println("Resultado: ");
        jogador1.imprimirStatus();

        System.out.println("-------------------------------------");

        System.out.println("Quantidade de vezes da coleta de moedas do jogador um: " + vezesDeColetarMoedas2);
        System.out.println("Resultado:");
        jogador2.imprimirStatus();
    }
}
