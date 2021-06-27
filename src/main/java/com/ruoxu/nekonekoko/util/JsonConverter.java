package com.ruoxu.nekonekoko.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ruoxu
 */
public class JsonConverter {
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
    * @date: 2021/6/26 11:42
    * @description: convert Object to String
    */
    public static String toString(final Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }
}
