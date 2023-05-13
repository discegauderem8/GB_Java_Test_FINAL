package org.example;

public class SimpleFormatter implements FormatterInterface{
    public String returnFormated (int id, String name, int count){
        String result = "ID игрушки: " + id + " Имя игрушки: " + name + " Кол-во игрушек: " + count + "\n";
        return result;
    }
}
