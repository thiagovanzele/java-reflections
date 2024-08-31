package br.com.alura.transformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {

    public String transform(Object obj) {
        String result = null;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String, Object> map = new HashMap<>();
        Class<?> classToBeTransformed = obj.getClass();

        Arrays.stream(classToBeTransformed.getDeclaredFields()).toList().forEach(
                field -> {
                    field.setAccessible(true);
                    String key = field.getName();
                    Object value = null;
                    try {
                        value = field.get(obj);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    map.put(key, value);
                }
        );

        try {
            result = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }
}
