package com.ruoxu.nekonekoko.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ruoxu
 */
public class JsonConverter {

    private JsonConverter() {
        throw new IllegalStateException("Utility class");
    }

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String toString(final Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }
}
