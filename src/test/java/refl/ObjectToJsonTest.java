package refl;

import br.com.alura.Pessoa;
import br.com.alura.transformation.ObjectToJson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectToJsonTest {

    Pessoa pessoa = PessoaFixture.buildPessoa();

    @Test
    public void shouldTransform() {
        ObjectToJson objectToJson = new ObjectToJson();
        String actual = objectToJson.transform(pessoa);

        Assertions.assertInstanceOf(String.class, actual);
    }
}
