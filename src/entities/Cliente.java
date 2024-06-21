package entities;

import exceptions.CadastroInvalidoException;
import exceptions.ClienteNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {

    private String nome;
    private String cpf;
    private static List<Cliente> listaClientes = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        validarCliente(cpf);
        this.nome = nome;
        this.cpf = cpf;
        addCliente(this);
    }

    private void validarCliente(String cpf) {
        if (cpf.length() != 11) {
            throw new CadastroInvalidoException("Erro no cadastro do cliente: Cpf inválido");
        }
        if(!listaClientes.isEmpty()) {
            boolean clienteJaCadastradoCpf = listaClientes.stream()
                    .anyMatch(cliente -> cliente.getCpf().equals(cpf));
            if (clienteJaCadastradoCpf) {
                throw new CadastroInvalidoException("Erro no cadastro do cliente: Cliente já cadastrado");
            }
        }
    }

    private void addCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
