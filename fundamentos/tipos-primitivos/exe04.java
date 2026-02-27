// Faça um programa que receba o salário de um funcionário e o percentual de aumento, 
// calcule e mostre o valor do aumento e o novo salário.

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        double salario, porcentagemAumt, salarioAumt;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do seu salrio: ");
        salario = input.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        porcentagemAumt = input.nextDouble();

        salarioAumt = salario + ((salario*porcentagemAumt)/100);
        System.out.print("Seu novo salario com aumento corresponde a: "+ salarioAumt);
    }
}