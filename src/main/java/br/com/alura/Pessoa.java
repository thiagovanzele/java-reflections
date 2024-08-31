package br.com.alura;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;

    public Pessoa(String nome) {
        this.nome = nome;
    }

}
