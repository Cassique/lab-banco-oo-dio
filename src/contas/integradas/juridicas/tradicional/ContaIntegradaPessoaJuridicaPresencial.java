package contas.integradas.juridicas.tradicional;

import banco.Cliente;
import contas.ContaBancaria;

public class ContaIntegradaPessoaJuridicaPresencial extends ContaBancaria {

    public ContaIntegradaPessoaJuridicaPresencial(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Integrada Pessoa Jurídica Presencial $$$$$$");
        imprimirInfosComuns();


    }

}
