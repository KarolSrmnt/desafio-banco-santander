package service;

import entities.Conta;
import exceptions.SaqueInvalidoException;

public interface IConta {

    void sacar(double valor) throws SaqueInvalidoException;

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
