package ResetModulo2;

import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args){
        //1:Faça um programa que peça uma nota, entre zero e dez.
        // Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez,
        // mostre uma mensagem informando o problema,
        // mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido.
        // Quando o usuário informar uma nota válida, imprima o valor da nota.

        /*System.out.println("Digite uma nota de 0 à 10:");
        Scanner nota = new Scanner(System.in);

        double notaDigitada = nota.nextDouble();
        while(notaDigitada < 0 || notaDigitada > 10){
            System.out.println("Digite uma nota de ZERO à DEZ! Te liga! Digite corretamente!");
            notaDigitada = nota.nextDouble();
        }

        System.out.println("Valor da nota é: " + notaDigitada);*/


        //2:Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles,
        // um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro,
        // solicite um novo número até que o segundo número seja maior que o primeiro.

        /*Scanner numUm = new Scanner(System.in);
        Scanner numDois = new Scanner(System.in);

        double primeiroNum;
        double segundoNum;

        System.out.println("Digite um número:");
        primeiroNum = numUm.nextDouble();

        System.out.println("Digite um segundo número:");
        segundoNum =numDois.nextDouble();

        while (primeiroNum >= segundoNum) {
            System.out.println("Digite novamente o primeiro número:");
            primeiroNum = numUm.nextDouble();

            System.out.println("Digite novamente o segundo número:");
            segundoNum = numDois.nextDouble();
        }

        for (double i = primeiroNum+1; i<segundoNum; i++){
            System.out.println("Intevalo entre os numeros digitados: " + i);
        }*/

        //3:Faça um programa que leia 5 números e informe o maior número.

        /*Scanner um = new Scanner(System.in);
        Scanner dois = new Scanner(System.in);
        Scanner tres = new Scanner(System.in);
        Scanner quatro = new Scanner(System.in);
        Scanner cinco = new Scanner(System.in);
        int numUm = um.nextInt();
        int numDois = dois.nextInt();
        int numTres = tres.nextInt();
        int numQuatro = quatro.nextInt();
        int numCinco = cinco.nextInt();*/



        //4:Desenvolva um gerador de tabuada,
        // capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        // O usuário deve informar de qual número ele deseja ver a tabuada.
        // A saída deve ser conforme o exemplo abaixo:

        Scanner tabuada = new Scanner(System.in);
        int numeroTabuada = tabuada.nextInt();

        for (int i = 0; i > 0; i++){
            System.out.println(numeroTabuada + " X "  + i + " = " + numeroTabuada*i);
        }

    }
}
