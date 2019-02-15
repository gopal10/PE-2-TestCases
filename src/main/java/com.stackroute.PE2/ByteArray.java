package com.stackroute.PE2;

import java.io.*;

public class ByteArray {





    public byte[] byteArray ( String folderName, String extensionName ) throws IOException {



        File[] files = new File("//home/gopal/Java/Assgn/PE2_testCases/src/main/java/com.stackroute.PE2/testfolder").listFiles();
        File working=null;
        for (File file: files) {
            if(file.getName().contains(extensionName)){
                working=file;
            }
            System.out.println(file.getName());
        }



        BufferedReader br = new BufferedReader(new FileReader(working));

        StringBuilder res=new StringBuilder("");
        String st;
        while ((st = br.readLine()) != null) {
            res.append(st);
        }
        return res.toString().getBytes();
    }


}
