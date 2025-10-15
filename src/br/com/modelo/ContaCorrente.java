package src.br.com.modelo;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String titular, int numero, double saldoInicial, double limite) {
        super(titular, numero, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public void cobrarTaxaMensal(double taxa) {
        if (taxa > 0) {
            setSaldo(getSaldo() - taxa);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Limite: R$ " + limite;
    }
}
