package entities;

import exceptions.ClienteNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private final String nome = "Banco";

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

}
