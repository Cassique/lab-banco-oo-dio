package contas.poupancas.fisicas.tradicional;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaPoupancaPessoaFisicaPresencial extends ContaBancaria {

    public ContaPoupancaPessoaFisicaPresencial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Poupança Pessoa Fisica Presencial $$$$$$");
        imprimirInfosComuns();

    }
}
