public class Conta {
        private Cliente cliente;
        protected double saldo;

        public Conta(Cliente cliente, double saldo) {
            this.cliente = cliente;
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            this.saldo += valor;
        }
    }

