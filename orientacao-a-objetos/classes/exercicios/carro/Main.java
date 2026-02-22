package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String action;
        Scanner scanner = new Scanner(System.in);

        Carro fiat = new Carro();


        while (true) {
            System.out.print("Digite uma ação: ");
            fiat.action(scanner.next());

            System.out.print(scanner.next());
        }
    }
}
