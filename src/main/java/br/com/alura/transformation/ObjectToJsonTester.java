package br.com.alura.transformation;

import br.com.alura.Pessoa;

public class ObjectToJsonTester {

    public static void main(String... x) {
        Pessoa pessoa = new Pessoa(1L, "João", "123456");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(pessoa));
    }
}
