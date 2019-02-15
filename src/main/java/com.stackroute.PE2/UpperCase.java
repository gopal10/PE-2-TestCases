package com.stackroute.PE2;
import java.io.*;

public class UpperCase {
    public String upperCase(String path) throws IOException {

        System.out.println(path);

        String path1="/home/gopal/Java/Assgn/PE2_testCases/src/main/inputFiles/"+path;

        String res="";
        File file = new File(path1);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            res= res+st;
        }
        return res.toUpperCase();
    }
}