package br.com.alura;

public class PessoaRepository {

    public Pessoa list() {
        return new Pessoa(1L, "João", "12345");
    }
}
