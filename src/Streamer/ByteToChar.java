package Streamer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToChar {
    public static void main(String[] args) {

        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            String filePath = scanner.readLine();
            FileInputStream inputStream = new FileInputStream(filePath);
            int count = 0;
            while (inputStream.available() > 0) {
                int string = inputStream.read();
                if(string == 44) {//44 в кодировки это ","
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
