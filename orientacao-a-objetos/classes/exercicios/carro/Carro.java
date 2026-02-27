public class Carro {
    String cor;
    String marca;

    boolean itAndando = false;

    // metodos de classe
    void andar() {
        System.out.println("Andando");
    }

    void parar(){
        if (itAndando){
            System.out.println("Carro parado.");
        }
    }
}



