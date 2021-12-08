package Streamer.System;

import java.io.*;

public class in {
    public static void main(String[] args) throws IOException {
//кладем данные в строку
        StringBuilder sb = new StringBuilder();
        sb.append("Bob").append('\n');
        sb.append("Mark").append('\n');
        sb.append("Frank").append('\n');
        String data = sb.toString();
//Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());
//подменяем in
        System.setIn(is);
//вызываем обычный метод, который не подозревает о наших манипуляциях
        readAndPrintLine();
    }
    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            //в обычных условиях компилятор ждал бы от нас ввода строки в консоль
            //но он подставляет уже существующие строки которые мы добавили через StringBuilder
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
