package banco;

import contas.correntes.juridicas.digital.ContaCorrentePessoaJuridicaDigital;
import contas.poupancas.fisicas.tradicional.ContaPoupancaPessoaFisicaPresencial;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Cassio Henrique da Silva");

        Cliente segundoCliente = new Cliente();
        segundoCliente.setNome("Heitor Silva");

        ContaPoupancaPessoaFisicaPresencial contaPoupancaPessoaFisicaPresencial = new ContaPoupancaPessoaFisicaPresencial(cliente);
        contaPoupancaPessoaFisicaPresencial.depositar(5000);
        contaPoupancaPessoaFisicaPresencial.sacar(1000);

        ContaCorrentePessoaJuridicaDigital contaCorrentePessoaJuridicaDigital= new ContaCorrentePessoaJuridicaDigital(segundoCliente);
        contaPoupancaPessoaFisicaPresencial.transferir(2500,contaCorrentePessoaJuridicaDigital);

        contaPoupancaPessoaFisicaPresencial.sacar(1000);

        contaPoupancaPessoaFisicaPresencial.imprimirExtrato();//500
        contaCorrentePessoaJuridicaDigital.imprimirExtrato();//2500



    }
}
