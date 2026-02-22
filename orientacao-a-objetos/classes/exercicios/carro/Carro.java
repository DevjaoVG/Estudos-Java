package test;

public class Carro {
    String cor;
    String marca;

    boolean itAndando = false;


    void action(String act) {
        if (act == "andar") {
            this.andar();
        }
    }

    void andar() {
        System.out.println("Andando");
    }

    void parar(){
        if (itAndando){
            System.out.println("Carro parado.");
        }
    }
}



