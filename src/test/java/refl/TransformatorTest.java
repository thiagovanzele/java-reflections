package refl;

import br.com.alura.Endereco;
import br.com.alura.PessoaDTO;
import br.com.alura.transformation.Transformator;
import br.com.alura.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;


public class TransformatorTest {

    Pessoa pessoa = new Pessoa(1L, "João", "12345");
    Endereco endereco = new Endereco("Rua 10", 20);

    @Test
    public void shouldTransform() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       Transformator transformator = new Transformator();
       PessoaDTO pessoaDTO = transformator.transform(pessoa);

        Assertions.assertInstanceOf(PessoaDTO.class, pessoaDTO);
        Assertions.assertEquals(pessoa.getNome(), pessoaDTO.getNome());
        Assertions.assertEquals(pessoa.getCpf(), pessoaDTO.getCpf());
    }

    @Test
    public void shouldNotTransform() {
        Assertions.assertThrows(ClassNotFoundException.class, () -> {
        Transformator transformator = new Transformator();
        transformator.transform(endereco);
        });
    }
}
