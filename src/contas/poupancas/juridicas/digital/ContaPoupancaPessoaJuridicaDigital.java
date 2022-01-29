package contas.poupancas.juridicas.digital;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaPoupancaPessoaJuridicaDigital extends ContaBancaria {

    public ContaPoupancaPessoaJuridicaDigital(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Poupança Pessoa Jurídica Digital $$$$$$");
        imprimirInfosComuns();


    }
}