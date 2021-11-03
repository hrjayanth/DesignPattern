package com.learn.jay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandPatternTester {

    @Test
    public void TestCommandPattern() {
        String fileName = "File1.txt";
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        String open = textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile(fileName)));
        String save = textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile(fileName)));

        assertEquals(open, "Opening file: " + fileName);
        assertEquals(save, "Saving file: " + fileName);
    }

    @Test
    public void TestCommandPatternLambda() {
        String fileName = "File1.txt";
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        String open = textFileOperationExecutor.executeOperation(() -> new TextFile(fileName).open());
        String save = textFileOperationExecutor.executeOperation(() -> new TextFile(fileName).save());

        assertEquals(open, "Opening file: " + fileName);
        assertEquals(save, "Saving file: " + fileName);
    }
}
