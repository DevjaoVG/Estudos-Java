class Conta {
    private double saldo = 0.0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}