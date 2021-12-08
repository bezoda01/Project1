package Streamer.System;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test extends FileOutputStream{
    public static String fileName = "/Users/zenapoznak/Desktop/newdirectory/Text1";



    FileOutputStream fileOutputStream;

    public Test(FileOutputStream file) throws IOException {
        super(fileName);
        this.fileOutputStream = file;
    }


    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        Test test = new Test(fileOutputStream);
        test.close();
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("Иди нахуй".getBytes());
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }
}
