import java.util.*;
//klass
public class Burger {
    private String name;
    private String meatType;
    private String breadType;
    private double price;
    private String extras;


    //konstruktor
    public Burger( String initialName) {
        this.name = initialName;
        this.meatType = "";
        this.breadType = "";
        this.price = 0;
    }
        public void setName(String newName) {
            this.name = newName;
        }

        public void setMeatType(String newMeatType) {
            this.meatType = newMeatType;
        }

        public void setBreadType(String newBreadType) {
            this.breadType = "teraleib";
        }

        //lisandid

        public static void main(String[] args) {
            ArrayList<String> extras = new ArrayList<String>();

            extras.add("Bacon");
            extras.add("Peppers");
            extras.add("Eggs");
            extras.add("Pickles");
        }

            public void setPrice(int newPrice) {
            this.price = newPrice;
        }



        // ...
    }

