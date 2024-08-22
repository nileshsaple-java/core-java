package com.ExceptionHandling.exapmes;

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader=null;
        try {
            // This line might throw a FileNotFoundException (Checked Exception)
            FileReader file = new FileReader("src/com/ExceptionHandling/exapmes/somefile.txt");

            reader = new BufferedReader(file);
            System.out.println(reader.readLine());

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
