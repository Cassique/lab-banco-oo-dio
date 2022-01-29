package contas.correntes.fisicas.tradicional;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaCorrentePessoaFisicaPresencial extends ContaBancaria {

    public ContaCorrentePessoaFisicaPresencial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Corrente Pessoa Fisica Presencial $$$$$$");
        imprimirInfosComuns();


    }

}