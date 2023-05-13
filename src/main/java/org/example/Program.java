package org.example;

public class Program {
    public static void main(String[] args) {
        Toys barbie = new Toys(1, "Barbie", 1);
        Toys bionicle = new Toys(2, "Bionicle", 3);
        Warehouse store = new Warehouse();
        store.addToys(barbie);
        store.addToys(barbie);
        store.addToys(bionicle);
        store.givePrizeToy();
        store.givePrizeToy();

        FileMaster fm = new FileMaster(new SimpleFormatter());
        for (Toys item : store.getToysList()
        ) {
            fm.exportData(item.getId(), item.getName(), item.getCount());
        }


    }
}