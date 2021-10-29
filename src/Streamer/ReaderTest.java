package Streamer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        try(Scanner sc = new Scanner(System.in)){
            List<String> lines = Files.readAllLines(Paths.get(sc.nextLine()));
            for(int i = 0;i < lines.size();i++){
                System.out.println(lines.get(i));
                i++;
            }
        }
    }
}
