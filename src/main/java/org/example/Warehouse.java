package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Warehouse implements ChanceMaster, PrizeGiver {
    private ArrayList<Toys> toysList = new ArrayList<>();
    private FileMasterInterface fileMaster;

    public Warehouse(FileMasterInterface fileMaster) {
        this.fileMaster = fileMaster;
    }

    public void addToys(Toys newItem) {
        boolean hasThisItem = false;
        for (Toys item : toysList
        ) {
             if (item.getName() == newItem.getName()){
                 item.setCount(item.getCount() + newItem.getCount());
                 hasThisItem = true;
             }
        }
        if (!hasThisItem){
            this.toysList.add(newItem);
        }
    }

    public void removeToys(Toys newItem) {
        this.toysList.remove(newItem);
    }

    public void assignDropChances() {
        double overallnumber = 0;
        for (Toys item : toysList) {
            double d = item.getCount();
            overallnumber += d;
        }
        for (Toys item : toysList) {
            double dropchance = 100.0 * (item.getCount() / overallnumber);
            System.out.println("Шанс выпадения " + item.getName() + " равен " + dropchance);
            item.setFinaldropChance(dropchance);
        }
    }

    public void givePrizeToy() {
        assignDropChances();

        Random random = new Random();
        double winner = random.nextDouble(0.0, 100.1);
        DecimalFormat decimalFormat = new DecimalFormat("#.#"); //Нашел только такой способ округления до
        String winnerConverted = String.format("%.1f", winner);        //одного числа после точки)))
        String winnerConverted2 = winnerConverted.replace(',', '.');//Java выдает вместо числа с точкой
        //число с запятой...
        System.out.println(winnerConverted2);
        winner = Double.parseDouble(winnerConverted2);

        double winZoneBottom = 0.0;
        double winZoneTop = 0.0;
        for (Toys item : toysList) {
            winZoneTop = winZoneBottom + item.getFinaldropChance();
            if (winner >= winZoneBottom && winner <= winZoneTop) {
                System.out.println("Победитель найден, это " + item.getName());
                item.setCount(item.getCount() - 1);

                break;
            }
            winZoneBottom = winZoneTop;
        }

    }
}

