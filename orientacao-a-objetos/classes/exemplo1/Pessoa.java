package exemplos;

public class Pessoa {
    String nome;
    int numFigurinhas;

    // metodos de classe Pessoa
    void receber(int numFigurinhas) {
        this.numFigurinhas += numFigurinhas;
    }

    void dar(int numFigurinhas, Pessoa people) {
        this.numFigurinhas -= numFigurinhas;
        people.numFigurinhas += numFigurinhas;
    }
}
