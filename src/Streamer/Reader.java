package Streamer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    static final String FILE_ONE = "/Users/zenapoznak/Desktop/First1.pages";
    static final String FILE_SECOND = "/Users/zenapoznak/Desktop/Second.pages";

    public static void main(String[] args) throws IOException, FileNotFoundException {
        try(FileReader fileReader = new FileReader(FILE_ONE); FileWriter fileWriter = new FileWriter(FILE_SECOND)){
            char[] buffer = new char[1000000];
            while(fileReader.ready()){//Пока данные есть в потоке
                int real = fileReader.read(buffer);//Читаем данные в буфер, из нашего массива
                fileWriter.write(buffer, 0, real);
            }
        }
    }
}
