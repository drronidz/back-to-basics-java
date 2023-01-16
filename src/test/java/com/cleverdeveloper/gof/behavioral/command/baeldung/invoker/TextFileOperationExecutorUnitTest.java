package com.cleverdeveloper.gof.behavioral.command.baeldung.invoker;

import com.cleverdeveloper.gof.behavioral.command.baeldung.command.OpenTextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.command.SaveTextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.command.TextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.receiver.TextFile;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 11:47 PM
*/

class TextFileOperationExecutorUnitTest {
    private static TextFileOperationExecutor textFileOperationExecutor;

    @BeforeAll
    static void beforeAll() {
        textFileOperationExecutor = new TextFileOperationExecutor();
    }

    @Test
    void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_OpenTextOperation_then_one_assertion() {
        TextFileOperation textFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        assertEquals(textFileOperationExecutor.executeOperation(textFileOperation),"Opening file file1.txt");
    }

    @Test
    void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_SaveTextOperation_then_one_assertion() {
        TextFileOperation textFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
        assertEquals(textFileOperationExecutor.executeOperation(textFileOperation),"Saving file file1.txt");
    }

    @Test
    void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_TextFileOpenLambda_then_one_assertion() {
        assertEquals(textFileOperationExecutor.executeOperation(() -> {return "Opening file file1.txt";}),"Opening file file1.txt");
    }

    @Test
    public void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_TextFileSaveLambda_then_one_assertion() {
        assertEquals(textFileOperationExecutor.executeOperation(() -> {return "Saving file file1.txt";}),"Saving file file1.txt");
    }

    @Test
    public void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_TextFileOpenMethodReferenceOfExistingObject_then_one_assertion() {
        TextFile textFile = new TextFile("file1.txt");
        assertEquals(textFileOperationExecutor.executeOperation(textFile::open),"Opening file file1.txt");
    }

    @Test
    public void given_TextFileOperationExecutorInstance_when_called_execute_operation_with_TextFileSaveMethodReferenceOfExistingObject_then_one_assertion() {
        TextFile textFile = new TextFile("file1.txt");
        assertEquals(textFileOperationExecutor.executeOperation(textFile::save),"Saving file file1.txt");
    }

    @Test
    public void givenOpenTextFileOperationExecuteMethodReference_whenCalledApplyMethod_then_one_assertion() {
        Function<OpenTextFileOperation, String> executeMethodReference = OpenTextFileOperation::execute;
        assertEquals(executeMethodReference.apply(new OpenTextFileOperation(new TextFile("file1.txt"))),"Opening file file1.txt");
    }

    @Test
    public void givenSaveTextFileOperationExecuteMethodReference_whenCalledApplyMethod_then_one_assertion() {
        Function<SaveTextFileOperation, String> executeMethodReference = SaveTextFileOperation::execute;
        assertEquals(executeMethodReference.apply(new SaveTextFileOperation(new TextFile("file1.txt"))),"Saving file file1.txt");
    }

    @Test
    public void givenOpenAndSaveTextFileOperationExecutorInstance_whenCalledExecuteOperationWithLambdaExpression_thenBothAssertion() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        assertEquals(textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt"),"Opening file file1.txt");
        assertEquals(textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt"),"Saving file file1.txt");
    }
}