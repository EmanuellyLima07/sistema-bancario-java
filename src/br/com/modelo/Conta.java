package src.br.com.modelo;

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    // Construtor : inicializa os atributos
    public Conta(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // getters e setters : acessar atributos privados
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos principais : são as operações que a conta faz
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta nº " + numero + " - Titular: " + titular + " - Saldo: R$ " + saldo;
    }
}
