package ResetModulo2;

import java.util.Scanner;

public class Aula10 {
    public static void main (String[] args){

        //1.Crie um programa que receba 5 valores e armazene em um vetor.
        // Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2.
        // Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.
        Scanner scan = new Scanner(System.in);

        int[] primeiroVetor = new int[5];
        int[] segundoVetor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite primeiro numero: ");
            primeiroVetor[i] = scan.nextInt();
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite primeiro numero: ");
//            primeiroVetor[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            segundoVetor[i] = primeiroVetor[i] * 2;
//        }

        for(int i = 0; i< primeiroVetor.length; i++ ){
            System.out.println("Primeiro Vetor:");
            System.out.println(primeiroVetor[i]);
        }

        System.out.println();

        for(int i = 0; i< segundoVetor.length; i++ ){
            System.out.println("Segundo Vetor:");
            System.out.println(segundoVetor[i]);
        }

        //2.Crie um programa que leia 10 valores inteiros correspondentes as idades
        // de um grupo de pessoas e armazene em um vetor.
        // Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos.
        // Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.

        int[] idade = new int[10];
        int maiorDeIdade = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite uma idade:");
            idade[i] = scan.nextInt();
        }

        for(int i = 0; i < idade.length; i++){
            if(idade[i] >= 18) {
                maiorDeIdade++;
            }
        }
        for (int i = 0; i<idade.length; i++){
            System.out.println("Idades: " + idade[i] );
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maiorDeIdade);
    }
}
