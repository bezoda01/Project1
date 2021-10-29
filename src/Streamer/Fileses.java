package Streamer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fileses {
    public static void main(String[] args) throws IOException {
        newFile_txt();

    }
    public static void newFile_txt()throws IOException{//метод по созданию файла с расширением txt
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Пожалуйста введите название файла с окончание - .txt");
            Path testPath = Files.createFile(Paths.get("/Users/zenapoznak/Desktop/" + sc.nextLine()));
        }
    }
}
