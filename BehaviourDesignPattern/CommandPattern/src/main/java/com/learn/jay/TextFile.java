package com.learn.jay;

public class TextFile {
    private String name;

    TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file: " + name;
    }

    public String save() {
        return "Saving file: " + name;
    }
}
