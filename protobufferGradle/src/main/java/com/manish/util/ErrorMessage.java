package com.manish.util;

public class ErrorMessage {

    public static final String FILE_NOT_FOUNT = "File not found at ";
    public static final String LOCATION = "location";

    public static String getPathNotFoundMessage(String path) {
        String result = FILE_NOT_FOUNT + path + LOCATION;
        return result;
    }
}
