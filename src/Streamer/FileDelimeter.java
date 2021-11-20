package Streamer;

import java.io.*;
import java.util.Arrays;

public class FileDelimeter {
    public static void main(String[] args) throws IOException {
        delimeter();
    }

    public static void delimeter() throws IOException {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {//поток, который создает аналог сканера
            String firstFile = scanner.readLine();
            String secondFile = scanner.readLine();
            String thirdFile = scanner.readLine();
            FileInputStream fileInput = new FileInputStream(firstFile);//поток, который читает наш файл
            FileOutputStream fileOutputSecond = new FileOutputStream(secondFile);//поток, который записывает в файл
            FileOutputStream fileOutputThird = new FileOutputStream(thirdFile);//поток, который записывает в файл
            byte[] buffer = new byte[fileInput.available()];//массив байтов, у которого длинна равняется числу доступных байтов в потоке читаемого файла
            while (fileInput.available() > 0) {
               fileInput.read(buffer);//записываем в наш массив байты из файла
            }
            System.out.println(buffer.length);//просто проверка
            //цель метода - записать половину байтов в один файл, другую половину во второй файл, при условии, что байтов четное колл-во
            //иначе, большую половину записать во второй файл, а вторую меньшую половину в третий файл
            //поток.write(data, of, len);
            //data - наш массив с байтами
            //of - сколько нужно пропустить байтов для начала записи
            //len(or offset - смещение) - какое количество байтов нужно записать ПОСЛЕ ПРОПУСКА
            while (true) {
                if((buffer.length % 2) != 0) {
                    int count = (buffer.length / 2) + 1;
                    fileOutputSecond.write(buffer, 0, count);
                    int offset = buffer.length - count;
                    fileOutputThird.write(buffer, count, offset);
                    break;
                } else {
                    int count = (buffer.length / 2) - 1;
                    fileOutputSecond.write(buffer, 0, count);
                    int offset = buffer.length - count;
                    fileOutputThird.write(buffer, count, offset);
                    break;
                }
            }
        }
    }
}
