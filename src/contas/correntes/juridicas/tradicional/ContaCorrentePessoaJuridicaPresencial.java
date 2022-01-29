package contas.correntes.juridicas.tradicional;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaCorrentePessoaJuridicaPresencial extends ContaBancaria {

    public ContaCorrentePessoaJuridicaPresencial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Corrente Pessoa Jurídica Presencial $$$$$$");
        imprimirInfosComuns();


    }

}