
import java.util.*;
public class Sleep {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birthdate: \nYear: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.print("Enter today's date: \nYear: ");
        int yearn = input.nextInt();
        System.out.print("Month: ");
        int monthn = input.nextInt();
        System.out.print("Day: ");
        int dayn = input.nextInt();
        int live;
        live = ((yearn*365) + (monthn*30) + dayn)- ((year*365)+(month*30)+day);
        int sleep;
        sleep = live*8;
        System.out.println("You have been alive for "+live+" days.");
        System.out.println("Your have slept "+sleep+" hours.");
        input.close();
    }
}
