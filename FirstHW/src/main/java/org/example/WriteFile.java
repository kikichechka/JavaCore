package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteFile {
    String way;
    CreateNote note;

    public WriteFile(String way, CreateNote note) {
        this.way = way;
        this.note = note;
    }

    private File createFile() {
        try {
            File file = new File(way);
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
            return file;
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
        }
        return null;
    }

    void write() {
        File file = createFile();
        if (file != null) {
            try {
                Date date = new Date();
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy -> ");
                FileWriter writer = new FileWriter(file, true);
                writer.write(formatForDateNow.format(date) + note.getNote() + "\n");
                writer.close();
                System.out.println("Запись в файл успешно завершена");
            } catch (IOException | NullPointerException e) {
                System.out.println("Ошибка при записи в файл");
            }
        }
    }
}
