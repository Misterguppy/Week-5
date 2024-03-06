
import java.util.*;
public class Timeconversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes:");
        int mins = input.nextInt();
        int min;
        min = mins % 60;
        int hr;
        hr = (mins - min)/60;
        System.out.println("The time is: "+hr+":"+min);
        input.close();
    }
}
