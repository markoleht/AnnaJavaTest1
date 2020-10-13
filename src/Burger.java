package sample;
import java.util.Scanner;

public class Burger {

    private String name;
    private String meatType;
    private String breadType;
    private double price;
    private String extras;

    //konstruktor
    public Burger( String name, String meatType, String breadType, int price) {
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

        public String[] getBurgers() {
            return burgers;
        }

        public String[] getExtras() {
            return extras;
        }

        public int getBurgersQuantity() {
            return burgersQuantity;
        }

        public int getExtrasQuantity() {
            return extrasQuantity;
        }

        public double[] getBurgerPrices() {
            return burgerPrices;
        }

        public double[] getExtrasPrices() {
            return extrasPrices;
        }

        public void setBurgers(String[] burgers) {
            this.burgers = burgers;
        }

        public void setExtras(String[] extras) {
            this.extras = extras;
        }

        public void setBurgerPrices(double[] burgerPrices) {
            this.burgerPrices = burgerPrices;
        }

        public void setExtrasPrices(double[] extrasPrices) {
            this.extrasPrices = extrasPrices;
        }

        public void setBurgersQuantity(int burgersQuantity) {
            this.burgersQuantity = burgersQuantity;
        }

        public void setExtrasQuantity(int extrasQuantity) {
            this.extrasQuantity = extrasQuantity;
        }
        // int burgersQuantity = 0;
        //int extrasQuantity = 0;

        //public void placeOrder( String burgers, String extras, double burgerPrices, double extrasPrices, int burgersQuantity, int extrasQuantity) {
        //boolean orderPlaced = false;



        double price = burgerPrices * burgersQuantity + extrasPrices * extrasQuantity ;
            System.out.println("Sinu tellimuse " + burgersQuantity + " " + burgers + "lisandiga " + extrasQuantity + extras + " maksumus on: " + price + " EUR.");




                    System.out.println();
                    System.out.println("Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist. - Hind 6.50 EUR");
                    System.out.println("Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest. - Hind 8.50 EUR");
                    System.out.println("New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. - Hind 9.50 EUR");
                    System.out.println();
                    System.out.println("    Bacon - 2.00 EUR");
                    System.out.println("    Peppers - 1.50 EUR");
                    System.out.println("    Eggs - 1.00 EUR");
                    System.out.println("    Pickles - 0.70 EUR");

                    System.out.println();
        Scanner in = new Scanner(System.in);
                    System.out.println("Millist burgerit soovid? ");
        String burgers = in.nextLine();

        Scanner in = new Scanner(System.in);
                    System.out.print("Millist lisandit soovid? ");
        String extras = in.nextLine();


    }
}
