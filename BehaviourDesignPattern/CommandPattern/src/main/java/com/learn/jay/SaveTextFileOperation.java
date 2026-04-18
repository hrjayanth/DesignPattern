package com.learn.jay;

public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
