package contas.integradas.fisicas.digital;

import banco.Banco;
import banco.Cliente;
import contas.ContaBancaria;

public class ContaIntegradaPessoaFisicaDigital extends ContaBancaria {

    public ContaIntegradaPessoaFisicaDigital(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$$$$ Extrato Conta Integrada Pessoa Fisica Digital $$$$$$");
        imprimirInfosComuns();

    }

}
