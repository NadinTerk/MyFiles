package TryCode;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class StandardStream {

    public static void main(String[] args) {
        int a;
        FileInputStream pathsFilesAndDir = null;
        FileOutputStream myFile = null;

        try {
            pathsFilesAndDir = new FileInputStream("C:/");
            myFile = new FileOutputStream("MyFolder.txt");

            do {
                if ((a = pathsFilesAndDir.read()) != -1) myFile.write(a);
            } while (a !=-1);


        }  catch (IOException e) {

        } finally {
        }
    }
}