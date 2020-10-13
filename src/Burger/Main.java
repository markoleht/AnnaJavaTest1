import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println( "Menüü - Vali omale meelepärane bugs");
        System.out.println();
        System.out.println("Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist. - Hind 6.50 EUR");
        System.out.println("Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest. - Hind 8.50 EUR");
        System.out.println("New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. - Hind 9.50 EUR");
        System.out.println();
        System.out.println(" Bacon - 2.00 EUR");
        System.out.println(" Peppers - 1.50 EUR");
        System.out.println(" Eggs - 1.00 EUR");
        System.out.println(" Pickles - 0.70 EUR");

        String name = reader.nextLine();
        System.out.println(name);

}}

