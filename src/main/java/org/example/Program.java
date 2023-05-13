package org.example;

public class Program {
    public static void main(String[] args) {
        Toys barbie = new Toys(1, "Barbie", 1);
        Toys bionicle = new Toys(2, "Bionicle", 3);
        Warehouse store = new Warehouse(new FileMaster(new SimpleFormatter()));
        store.addToys(barbie);
        store.addToys(barbie);
        store.addToys(bionicle);
        store.givePrizeToy();
        store.givePrizeToy();
        store.givePrizeToy();
    }
}