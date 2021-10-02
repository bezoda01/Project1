package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) throws IOException,FileNotFoundException{


        String src = "/Users/zenapoznak/Desktop/First1.pages";
        String dest = "/Users/zenapoznak/Desktop/Second.pages";

        try (FileInputStream input = new FileInputStream(src);//InputStream для чтения из файла
             FileOutputStream output = new FileOutputStream(dest))//OutputStream для записи в файл
        {
            byte[] buffer = new byte[65536]; // Буфер, в который будем считывать данные
            while (input.available() > 0) {//Пока данные есть в потоке
                int real = input.read(buffer);//Считываем данные в буфер
                output.write(buffer, 0, real);//Записываем данные из буфера во второй поток
            }
        }
    }
}
