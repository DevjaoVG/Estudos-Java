// 2. Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada
// joao vitor

import java.util.Scanner;


public class exe03 {
    public static void main(String[] args) {
        int n1, n2, n3;
        int p1, p2, p3;
        int media;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite primeira nota: ");
        n1 = input.nextInt();
        System.out.print("Digite primeira nota: ");
        p1 = input.nextInt();

        System.out.print("Digite primeira nota: ");
        n2 = input.nextInt();
        System.out.print("Digite primeira nota: ");
        p2 = input.nextInt();

        System.out.print("Digite primeira nota: ");
        n3 = input.nextInt();
        System.out.print("Digite primeira nota: ");
        p3 = input.nextInt();

        media = ((n1*p1)+(n2*p2)+(n3*p3))/3;
        System.out.print("A media ponderado do aluno é: "+media);
    }
}
