package exemplos.exem02;

public class Aplic {
    public static void main(String[] args) {
        Matematica mat = new Matematica();

        int soma = mat.somar(12, 33, 11);
        System.out.println(soma);

        int soma1 = mat.somar(12, 33, 11);
        System.out.println(soma1);
    }
}