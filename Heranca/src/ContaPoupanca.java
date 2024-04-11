class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005; // 0.5%

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public void calcularRendimento() {
        double rendimento = this.saldo * TAXA_RENDIMENTO;
        this.depositar(rendimento);
    }
}

class ContaEmpresarial extends ContaEspecial {
    public ContaEmpresarial(Cliente cliente, double saldo, double chequeEspecial) {
        super(cliente, saldo, chequeEspecial);
    }
}