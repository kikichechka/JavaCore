package org.example;

public class Main {
    public static void main(String[] args) {
        CreateNote note = new CreateNote("Hello, world!");
        WriteFile file = new WriteFile("C:\\Users\\Екатерина\\Desktop\\note.txt", note);
        file.write();
    }
}