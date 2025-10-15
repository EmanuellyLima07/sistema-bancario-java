package src.br.com.data;

import java.util.ArrayList;
import src.br.com.modelo.Conta;

public class BancoDeDados {

    private ArrayList<Conta> contas;

    public BancoDeDados() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null; // null : caso não encontre o número
    }

    public void listarContas() {
        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}
