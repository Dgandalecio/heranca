
    class ContaCorrente extends Conta {
        public ContaCorrente(Cliente cliente, double saldo) {
            super(cliente, saldo);
        }

        public void sacar(double valor) {
            if (this.saldo - valor >= 0) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }