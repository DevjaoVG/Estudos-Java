// Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, 
// calcule e mostre a comissão e seu salário final.
// joao vitor

import java.util.Scanner;


public class exe06 {
    public static void main(String[] args) {
        double salario, salarioFinal, comissao;
        int vendas;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salario: ");
        salario = input.nextDouble();

        System.out.print("Digite o numero de vendas: ");
        vendas = input.nextInt();

        comissao = vendas*((salario*4)/100);
        salarioFinal = salario+comissao;

        System.out.print("Valor de sua comissao: "+ comissao);
        System.out.print("Seu salario com acrescimo de comissao: "+ salarioFinal);
    }
}