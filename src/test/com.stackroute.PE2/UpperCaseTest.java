package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;
import static org.junit.Assert.*;

public class UpperCaseTest {

     UpperCase uppercase;

    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        uppercase = new UpperCase();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        uppercase = null;

    }

//    @Test
//    public void upperCaseSuccess() throws IOException {
//
//        File file = new File("./src/main/inputFiles/input.txt");
//        String path = file.getAbsolutePath();
//       assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
//       assertEquals("successfully converted to uppercase","AMAN BATHLA",uppercase.upperCase(path));
//       assertNotEquals("Spaces should not be there","amanbathla",uppercase.upperCase(path));
//        assertNotEquals("Error in converting to uppercase","aman bathla",uppercase.upperCase(path));
//        assertNotEquals("full name is not there","AMAN",uppercase.upperCase(path));
//        assertEquals("successfully converted to uppercase","AMAN BATHLA",uppercase.upperCase(path));
//
//    }
//    @Test
//    public void upperCaseSuccess1() throws IOException {
//
//        File file = new File("./src/main/inputFiles/input1.txt");
//        String path = file.getAbsolutePath();
//        assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
//        assertEquals("successfully converted to uppercase","SANTOSH",uppercase.upperCase(path));
//        assertNotEquals("Spaces should not be there","santosh",uppercase.upperCase(path));
//        assertNotEquals("Error in converting to uppercase","santosh",uppercase.upperCase(path));
//        assertNotEquals("full name is not there","SANTOSH",uppercase.upperCase(path));
//        assertEquals("successfully converted to uppercase","santosh",uppercase.upperCase(path));
//
//    }

    @Test
    public void upperCaseSuccess2() throws IOException {

//        File file = new File("./src/main/inputFiles/input2.txt");
//        String path = file.getAbsolutePath();
        //assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
        assertEquals("FARHAAN",uppercase.upperCase("input2.txt"));
//        assertNotEquals("Spaces should not be there","farhaan",uppercase.upperCase("input2.txt"));
//        assertNotEquals("Error in converting to uppercase","farhaan",uppercase.upperCase("input2.txt"));
       assertNotEquals("full name is not there","FARHAAN",uppercase.upperCase("input2.txt"));
    assertEquals("successfully converted to uppercase","farhan",uppercase.upperCase("input2.txt"));

    }
//    @Test
//    public void upperCaseSuccess3() throws IOException {
//
//        File file = new File("./src/main/inputFiles/input3.txt");
//        String path = file.getAbsolutePath();
//        assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
//        assertEquals("successfully converted to uppercase","AJAY",uppercase.upperCase(path));
//        assertNotEquals("Spaces should not be there","ajay",uppercase.upperCase(path));
//        assertNotEquals("Error in converting to uppercase","ajay",uppercase.upperCase(path));
//        assertNotEquals("full name is not there","AJAY",uppercase.upperCase(path));
//        assertEquals("successfully converted to uppercase","AJAY",uppercase.upperCase(path));
//
//    }


}