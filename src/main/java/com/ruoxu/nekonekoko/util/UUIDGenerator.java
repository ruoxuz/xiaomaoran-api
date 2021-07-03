package com.ruoxu.nekonekoko.util;

import java.util.UUID;

/**
 * @author ruoxu
 */
public class UUIDGenerator {

    private UUIDGenerator() {
        throw new IllegalStateException("Utility class");
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
