package refl;

import br.com.alura.Pessoa;

public class PessoaFixture {

    static Pessoa buildPessoa() {
        return new Pessoa(1L, "João", "123456");
    }
}
