package ResetModulo2;

import java.util.Scanner;

public class Aula08 {

    public static void main(String[] args) {
        //Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final o programa deve apresentar:
        // A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
        //A mensagem Aluno reprovado, se a média for inferior a sete;
        //A mensagem Aluno aprovado com louvores, se a média for igual a dez.

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double notaUm = notas.nextDouble();

        System.out.println("Digite a segunda nota:");
        double notaDois = notas.nextDouble();

        System.out.println("Digite a terceira nota:");
        double notaTres = notas.nextDouble();

        System.out.println("Difite a quarta nota:");
        double notaQuatro = notas.nextDouble();

        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        if(media >= 7){
            System.out.println("Aluno aprovado");
        }
        if (media < 7) {
            System.out.println("Aluno reprovado");
        }
        if (media==10){
            System.out.println("Aluno aprovado com louvores");
        }

        //Faça um Programa que leia um número e exiba o dia correspondente da semana.
        // (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não corresponda à um dia da semana,
        // então deve imprimir a mensagem Valor inválido!.

        System.out.println("-------------------------------------");
        System.out.println("Digite um número da semana de 1 à 7:");
        Scanner dia = new Scanner(System.in);

        int diaSemana = dia.nextInt();
        switch (diaSemana){
            case 1:
                System.out.println("1=Domingo");break;
            case 2:
                System.out.println("2=Segunda");break;
            case 3:
                System.out.println("3=Terça");break;
            case 4:
                System.out.println("4=Quarta");break;
            case 5:
                System.out.println("5=Quinta");break;
            case 6:
                System.out.println("6=Sexta");break;
            case 7:
                System.out.println("7=sábado");break;
            default:
                System.out.println("Valor inválido! Te liga!");
        }

    }
}
