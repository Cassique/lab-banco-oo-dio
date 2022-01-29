package contas.integradas.juridicas.digital;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaIntegradaPessoaJuridicaDigital extends ContaBancaria {

    public ContaIntegradaPessoaJuridicaDigital(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Integrada Pessoa Jurídica Digital $$$$$$");
        imprimirInfosComuns();


    }

}