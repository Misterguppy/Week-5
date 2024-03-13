/**Emet Park
 * 3/13/24
 * Geometry.java
 * exam one
 */
import java.util.*;
public class Geometry {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("imput a number: ");
        int m = input.nextInt();
        System.out.print("input a number less than the number before");
        int n = input.nextInt();
        double sideone = (m * m)-(n*n);
        double sidetwo = (2*m)*n;
        double hyp = (m*m)+(n*n);
        System.out.println(sideone+", "+sidetwo+", and "+hyp);
        double cost = (2.412*sideone)+(3.767*sidetwo)+(15.758*hyp);
        System.out.println("The cost of the triple is "+cost);
        input.close();
    }
}
