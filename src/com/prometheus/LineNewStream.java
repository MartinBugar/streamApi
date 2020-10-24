package com.prometheus;

import java.io.*;

public class LineNewStream {
    public static void main(String[] args) throws IOException {

        BufferedReader inputstream = null;
        PrintWriter outputstream = null;

        try{
            inputstream = new BufferedReader(new FileReader("resources/text.txt"));
            outputstream = new PrintWriter(new FileWriter("resources/output.txt"));

            PrintWriter finalOutputstream = outputstream;
            inputstream.lines().forEach(l -> finalOutputstream.println(l));

        }finally {
            if (inputstream != null){
                inputstream.close();
            }
            if(outputstream != null){
                outputstream.close();
            }
        }
    }
}
