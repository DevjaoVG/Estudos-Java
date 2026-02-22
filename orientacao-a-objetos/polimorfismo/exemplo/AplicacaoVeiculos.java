class AplicacaoVeiculos {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();

        moto.buzinar(); // Saída: Moto buzinando: BIP BIP!
        carro.buzinar(); // Saída: Carro buzinando: BEEP BEEP!
    }
}