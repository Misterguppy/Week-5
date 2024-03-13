/**Emet Park
 * 3/13/24
 * Building.java
 * exam one
 */
import java.util.*;
public class Building {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many poles are needed? ");
        int poles = input.nextInt();
        double vol = 3.14159*(1.5*1.5)*(5);
        double totvol =  poles*vol;
        double one = totvol/27;
        double cost = 12.98*one;
        double refine = cost% 0.01;
        cost = cost - refine;
        System.out.println("The "+poles+" poles cost $"+cost);
        input.close();

    }
}
