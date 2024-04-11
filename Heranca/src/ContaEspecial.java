class ContaEspecial extends Conta {
    private double chequeEspecial;

    public ContaEspecial(Cliente cliente, double saldo, double chequeEspecial) {
        super(cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void sacar(double valor) {
        if (this.saldo + this.chequeEspecial - valor >= 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
