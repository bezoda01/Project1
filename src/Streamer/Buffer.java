package Streamer;

import java.io.*;

public class Buffer {
    static String src = "/Users/zenapoznak/Desktop/First2.txt";
    public static void main(String[] args) throws IOException {

        //bufferReaderInFile();
        bufferScanner();
    }

    public static void bufferReaderInFile()throws IOException{
        try(FileReader in = new FileReader(src);
            BufferedReader reader = new BufferedReader(in))
        {
            while (reader.ready())
            {
                String line = reader.readLine();
                System.out.println(line);
            }
        }
    }//метод по чтению из файла

    public static void bufferScanner()throws IOException{
        try(InputStream stream = System.in;
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buff = new BufferedReader(reader)){
            String line = buff.readLine();
            System.out.println(line);
        }
    }
}
