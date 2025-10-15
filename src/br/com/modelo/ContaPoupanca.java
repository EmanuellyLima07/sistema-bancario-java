package src.br.com.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int numero, double saldoInicial) {
        super(titular, numero, saldoInicial);
    }

    public void renderJuros(double taxa) {
        if (taxa > 0) {
            double novoSaldo = getSaldo() + (getSaldo() * taxa);
            setSaldo(novoSaldo);
        }
    }

}
