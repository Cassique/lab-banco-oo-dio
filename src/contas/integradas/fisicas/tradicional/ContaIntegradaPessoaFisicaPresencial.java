package contas.integradas.fisicas.tradicional;

import banco.Cliente;
import contas.ContaBancaria;

public class ContaIntegradaPessoaFisicaPresencial extends ContaBancaria {

    public ContaIntegradaPessoaFisicaPresencial(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Integrada Pessoa Fisica Presencial $$$$$$");
        imprimirInfosComuns();


    }

}
