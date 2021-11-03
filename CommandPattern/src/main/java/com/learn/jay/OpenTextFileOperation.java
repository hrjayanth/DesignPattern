package com.learn.jay;

public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
