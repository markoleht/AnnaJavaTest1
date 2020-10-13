import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println( "Menüü - Vali omale meelepärane bugs");
        System.out.println();
        System.out.println("Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist.");
        System.out.println("Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest.");
        System.out.println("New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. ");
        String name = reader.nextLine();
        System.out.println(name);

}}

