package banco;

import contas.ContaBancaria;
import java.util.List;

public class Banco {

    private static int AGENCIA_PADRAO = 1;

    private String nome;
    private List<ContaBancaria> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

}