package contas.correntes.fisicas.digital;

import banco.Cliente;
import contas.ContaBancaria;

public class ContaCorrentePessoaFisicaDigital extends ContaBancaria {

    public ContaCorrentePessoaFisicaDigital(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Corrente Pessoa Fisica Digital $$$$$$");
        imprimirInfosComuns();

    }

}