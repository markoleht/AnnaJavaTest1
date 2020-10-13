package sample;

import java.util.Scanner;

public class Burger {

    private String name;
    private String meatType;
    private String breadType;
    private double price;
    private String extras;

    //konstruktor
    public Burger(String name, String meatType, String breadType, int price) {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public String meatType() {
        return meatType;
    }

    public String breadType() {
        return breadType;
    }

    public double price() {
        return price;
    }

    public class Order {

        String[] burgers = {"Chicken burger", "Old Fashioned Cheeseburger", "New York Burger"};
        String[] extras = {"Bacon", "Peppers", "Eggs", "Pickles"};
        double[] burgerPrices = {6.50, 8.50, 9.50};
        double[] extrasPrices = {2.00, 1.50, 1.00, 0.75};


        Scanner input = new Scanner(System.in);
        System.out.println("Vali burger");
        burgers[i] = input.nextDouble()
        String[] burgers = {"Chicken burger", "Old Fashioned Cheeseburger", "New York Burger"};
                if (burgers.equals(answer, "Chicken burger"[0]) || burgers.equals(answer,"Old Fashioned Cheeseburger"[1]) ||
                burgers.equals(answer,"New York Burger"[2])])

        Scanner input = new Scanner(System.in);
        System.out.println("Vali lisand")
        extras[i] = input.nextDouble()
        String[] extras = {"Bacon", "Peppers", "Eggs", "Pickles"};
                if (extras.equals(answer, "Bacon"[0]) || extras.equals(answer,"Peppers"[1]) ||
                extras.equals(answer,"Eggs"[2]) || extras.equals(answer,"Pickles"[3]) ])


            System.out.println("Sinu tellimuse "+burgersQuantity +" "+burgers +"lisandiga "+extrasQuantity +extras +" maksumus on: "+price +" EUR.");

                    System.out.println( "MENÜÜ");
                    System.out.println();
                    System.out.println("Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist. - Hind 6.50 EUR");
                    System.out.println("Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest. - Hind 8.50 EUR");
                    System.out.println("New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. - Hind 9.50 EUR");
                    System.out.println();
                    System.out.println("    Bacon - 2.00 EUR");
                    System.out.println("    Peppers - 1.50 EUR");
                    System.out.println("    Eggs - 1.00 EUR");
                    System.out.println("    Pickles - 0.70 EUR");

    }
}
