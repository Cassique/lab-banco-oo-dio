package contas.poupancas.juridicas.tradicional;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaPoupancaPessoaJuridicaPresencial extends ContaBancaria {

    public ContaPoupancaPessoaJuridicaPresencial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Poupança Pessoa Jurídica Presencial $$$$$$");
        imprimirInfosComuns();


    }

}