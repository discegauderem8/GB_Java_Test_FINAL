package org.example;

public class SimpleFormatter implements FormatterInterface{
    public String returnFormated (int id, String name, int count, int dropChance){
        String result = "ID игрушки: " + id + "Имя игрушки: " + name + "Кол-во игрушек: " + count +
                "Шанс выпадения игрушки при розыгрыше: " + dropChance;
        return result;
    }
}
