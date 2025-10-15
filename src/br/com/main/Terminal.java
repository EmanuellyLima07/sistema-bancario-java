package src.br.com.main;

import src.br.com.data.BancoDeDados;
import src.br.com.modelo.*;
//'*' : importa todas as classes do package

public class Terminal {

    public static void main(String[] args) {

        BancoDeDados banco = new BancoDeDados();

        Conta c1 = new Conta("Ana", 1001, 1500.0);
        ContaPoupanca c2 = new ContaPoupanca("Manu", 1002, 2000.0);
        ContaCorrente c3 = new ContaCorrente("Carla", 1003, 500.0, 1000.0);

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        c1.depositar(200);
        c2.renderJuros(0.05);
        c3.sacar(1200); // usa o limite

        System.out.println("\n--- Contas no Banco ---");
        banco.listarContas();

        System.out.println("\n--- Após cobrar taxa da conta corrente ---");
        c3.cobrarTaxaMensal(15.0);
        System.out.println(c3);

        System.out.println("\n--- Buscando conta nº 1002 ---");
        Conta contaEncontrada = banco.buscarConta(1002);
        if (contaEncontrada != null) {
            System.out.println("Encontrada: " + contaEncontrada);
        } else {
            System.out.println("Conta não foi encontrada.");
        }
    }
}
