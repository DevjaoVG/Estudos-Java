// 1. Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
// joaovitor

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        int n1, n2, n3, media;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite primeira nota: ");
        n1 = input.nextInt();
        System.out.print("Digite segunda nota: ");
        n2 = input.nextInt();
        System.out.print("Digite terceira nota: ");
        n3 = input.nextInt();

        media = (n1+n2+n3)/3;
        System.err.println("A media do aluno é: "+media);
    }
}
