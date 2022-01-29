package contas.poupancas.fisicas.digital;

import banco.Cliente;
import contas.ContaBancaria;

public class ContaPoupancaPessoaFisicaDigital extends ContaBancaria {

    public ContaPoupancaPessoaFisicaDigital(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Poupança Pessoa Fisica Digital $$$$$$");
        imprimirInfosComuns();


    }
}