package Streamer;

import java.io.*;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        write();
    }

    public static void write() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите полный путь файла");
            while (true) {
                String path = reader.readLine();
                File file = new File(path);
                if (file.isFile()) {
                    System.out.println("File");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(path));
                    while (true) {
                        String text = reader.readLine();
                        if (!text.equals("exit")) {
                            writer.write(text + "\n");
                        } else {
                            writer.write(text + "\n");
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Not a file");
                }

            }
        }
    }
}

