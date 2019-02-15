package com.stackroute.PE2;

import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDataTest {

    StudentData studentData;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentData = new StudentData();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentData = null;

    }
    @Test
    public void studentDataSuccess() {
        int arrofstu[]={86,65,98,77};
        int arrofstu2[]={68,77,95,87};
        double actualOutput[] = studentData.studentData(4,arrofstu);
        double expectedOutput[]={81.50,65.0,98.0};
        double expectedOutput3[]={81.50,65.0,98.0};
        double expectedOutput2[]=null;


        assertNull("please return null if array length is not according to no of students",expectedOutput2);
        assertArrayEquals(expectedOutput3,actualOutput,0.01);



    }



    @Test
    public void studentDataFailure() {
    }
}