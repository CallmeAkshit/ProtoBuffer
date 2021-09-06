package com.manish.exceptions;

public class PathNotFoundException extends  Exception {

    public PathNotFoundException(String path) {
        super(path);
    }
}
