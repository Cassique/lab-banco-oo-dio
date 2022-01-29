package contas.correntes.juridicas.digital;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaCorrentePessoaJuridicaDigital extends ContaBancaria {

    public ContaCorrentePessoaJuridicaDigital(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Corrente Pessoa Juridica Digital $$$$$$");
        imprimirInfosComuns();


    }

}