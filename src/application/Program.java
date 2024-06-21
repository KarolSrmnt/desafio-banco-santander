package application;

import entities.Cliente;
import entities.Conta;
import service.ContaCorrente;
import service.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(new Cliente("Marcela", "11111111111"));
        Conta cc2 = new ContaCorrente(new Cliente("Bruce", "11111111113"));
        Conta cp = new ContaPoupanca(new Cliente("Maria", "11111111112"));

        cc.depositar(100);
        cp.depositar(300);
        cc.imprimirExtrato();
        cc2.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
