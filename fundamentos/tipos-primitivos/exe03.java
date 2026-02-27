//3 . Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se 
//que este sofreu um aumento de 25%.

import java.util.Scanner;


public class exe04 {
    public static void main(String[] args) {
        double salario, salarioAumt;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: ");
        salario = input.nextDouble();

        salarioAumt = salario + (salario*25)/100;
        System.out.println("Seu novo salario com aumeto de 25% corresponde a: "+ salarioAumt);
    }
}