class AplicacaoConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println("Saldo inicial: " + conta.getSaldo()); // Saída: Saldo inicial: R$ 0.0

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo()); // Saída: Depósito realizado: R$ 500.0
    }
}