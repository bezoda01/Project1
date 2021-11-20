package Streamer;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //fileInputStreamWithOneByte();
        //fileInputStreamWithMassBytes();
    }
    public static void fileInputStreamWithOneByte() throws FileNotFoundException {
        try (  FileInputStream fileInput = new FileInputStream("/Users/zenapoznak/Desktop/newdirectory/Text");
               //создали поток-чтения-байт-из-файла, из которого мы будем копировать байты
               FileOutputStream fileOutput = new FileOutputStream("/Users/zenapoznak/Desktop/newdirectory/newdirectoryDatch.txt"))
        //создали поток-записи-байт-из-файла, в который будем копировать байты
        {
            while(fileInput.available() > 0) { // пока доступный байты
                int data = fileInput.read();//читаем байт из файла и записываем его в переменную data
                fileOutput.write(data);//записываем его в файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //обертка создания потоков в try дает нам автоматическое закрытие потоков вместо НАПРИМЕР: fileOutput.close();
    }
    public static void fileInputStreamWithMassBytes() throws IOException {
        try ( FileInputStream fileInput = new FileInputStream("/Users/zenapoznak/Desktop/newdirectory/Text");
              FileOutputStream fileOutput = new FileOutputStream("/Users/zenapoznak/Desktop/newdirectory/newdirectoryDatch.txt"))
        {
            byte[] buffer = new byte[1000];//наш буфер в который мы сохраним байты
            while (fileInput.available() > 0) {
                int count = fileInput.read(buffer);
                //Метод read при чтении последнего блока вернет значение равное количеству реально прочитанных байт.
                //Для всех чтений – 1000, а для последнего блока – 328.
                fileOutput.write(buffer, 0, count);
                //записать блок(часть блока) во второй поток, то есть записали первую 1000 байт в файл
            }
        }
    }

}
