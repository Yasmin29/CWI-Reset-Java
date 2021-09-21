package ResetModulo2;

import java.util.Scanner;

public class Aula07 {
    public static void main (String[] args) {
        //1.Faça um programa que tenha como entradas dois números e imprima a soma de ambos.
        // Utilize a classe Scanner para obter as entradas.

        Scanner soma = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para somar:" );
        double numeroUm = soma.nextDouble();

        System.out.println("Digite o segundo número para somar:");
        double numeroDois = soma.nextDouble();

        System.out.println("Resultado: " + (numeroUm + numeroDois));

        //2.Faça um programa que tenha como entradas 4 notas e imprima a média.
        // Utilize a classe Scanner para obter as entradas.

        Scanner media = new Scanner(System.in);

        System.out.println("Digite a primera nota: ");
        double notaUm = media.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaDois = media.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double notaTres = media.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double notaQuatro = media.nextDouble();

        System.out.println("Média: " + ((notaUm + notaDois + notaTres + notaQuatro)/4));


        //3.Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês.

        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o valor que você recebe por hora: " );
        double salarioPorHora = salario.nextDouble();

        System.out.println("Digite quantas horas você trabalhou: ");
        double horasTrabalhadas = salario.nextDouble();

        System.out.println("Valor total que receberá neste mês: " + (salarioPorHora * horasTrabalhadas));

    }
}
