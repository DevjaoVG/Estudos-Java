package exemplos;

public class Aplicação {
    public static void main(String[] args) {
        // Criando Objeto
        Pessoa people1 = new Pessoa();
        people1.nome = "João";
        Pessoa people2 = new Pessoa();
        people2.nome = "Maria";

        // Metodo receber
        people1.receber(5);
        people1.receber(7);

        people1.dar(9, people2);

        // svso + ctrl + espaço
        System.out.println(people1.nome + " => " + people1.numFigurinhas);
        System.out.println(people2.nome + " => " + people2.numFigurinhas);
    }
}
