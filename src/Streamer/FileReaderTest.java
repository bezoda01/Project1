package Streamer;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        readerFromFile("/Users/zenapoznak/Desktop/newdirectory/Text");
    }

    public static void readerFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             //создали поток - который читает из файла и передает в буфер
             BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in)))
             //создали поток для чтения с консоли
        {
            System.out.println("Woud you like read the file?");
            while (true) {

                String answer = scanner.readLine();
                if(answer.equals("yes")) {
                    while (reader.ready()) {
                        String line = reader.readLine();
                        System.out.println(line);
                    }
                    break;
                }
                else if(answer.equals("no")) {
                    break;
                }else {
                    System.out.println("Please, input correctly: yes or no.");
                }
            }
        }
    }
    //Method for reading the file
}
