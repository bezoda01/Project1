package Stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Stream_test {
    public static final String str = "/Users/zenapoznak/Desktop/First2.rtf";
    public static final String NULL_SPACE = "/Users/zenapoznak/Desktop/First2.txt";

    public void setDirectory(String directory) {
        this.directory = directory;
    }
    public String getDirectory() {
        return directory;
    }
    private String directory;



    public static void main (String[] args) throws IOException {
        Stream_test stream_test = new Stream_test();
       //stream(NULL_SPACE);
        stream_test.streamInFiles();//основна для записи консольного текста в файл
        //streamInFile();
        //stream2(NULL_SPACE);//чтение файла и вывод его в консоль
        readFileSimple(stream_test.getDirectory());//чтение из файла и вывод его в консоль
    }

    public static void stream(String str) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(str)) {
            int ch;
            StringBuilder sb = new StringBuilder();
            while ((ch = inputStream.read()) != -1) {
                sb.append((char) ch);
            }
            System.out.println(sb);
        } catch (IOException e) {
            System.out.println("Hello");
        }
    }

    public static void stream2(String str) throws IOException{//метод по чтению файла и перевода текста в консоль
        try(FileInputStream fis = new FileInputStream(str))//конструктор FileInputStream(строка с адресом файла TXT!)
        {
            while(fis.available() > 0){//цикл пока байтов больше 0
                System.out.print((char)fis.read());//выводим текст с помощью метода - имя.read() - с переводом в тип char
            }
        }
    }

    public static void streamInFile() throws IOException{
        try(Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream(NULL_SPACE))
        {
            byte[] buffer = sc.nextLine().getBytes(StandardCharsets.UTF_8);
            fos.write(buffer, 0, buffer.length);
        }
    }

    public void streamInFiles() throws IOException{//метод по записи в файл текста из консоли
        try(InputStream stream = System.in;
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader buff = new BufferedReader(streamReader))//создаем аналог scanner только из потока
        {

            System.out.println("Введите имя нового файла");
            String file = buff.readLine();
            Path file1 = Files.createFile(Paths.get("/Users/zenapoznak/Desktop/" + file + ".txt"));
            setDirectory("/Users/zenapoznak/Desktop/" + file + ".txt");
            if(Files.exists(Paths.get("/Users/zenapoznak/Desktop/" + file + ".txt"))){
                System.out.println("Файл создан успешно");
            }

            System.out.println("Введите текст в файл");
            FileOutputStream fos = new FileOutputStream("/Users/zenapoznak/Desktop/" + file + ".txt");
            byte[] buffer = buff.readLine().getBytes();//создаем массив байтов, вводим строку в консоли и переводим её в байты стандарта utf_8
            for(int i = 0;i < buffer.length;i++){//записываем по одному байту
                    fos.write(buffer[i]);
            }

        }
    }

    public static void readFileSimple(String strs) throws IOException{
            List<String> lines = Files.readAllLines(Paths.get(strs));
            for(String str : lines){
                System.out.print(str);
            }
        }
    }
