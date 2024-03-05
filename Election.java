/**Emet Park */
import java.util.*;
import java.text.NumberFormat;
public class Election{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What are Awbrey's votes in New York? ");
        double any = input.nextInt();
        System.out.print("What are Awbrey's votes in New Jersey? ");
        double anj = input.nextInt();
        System.out.print("What are Awbrey's votes in Connecticut? ");
        double act = input.nextInt();
        System.out.print("What are Martinez's votes in New York? ");
        double mny = input.nextInt();
        System.out.print("What are Martinez's votes in New Jersey? ");
        double mnj = input.nextInt();
        System.out.print("What are Martinez's votes in Connecticut? ");
        double mct = input.nextInt();
        double atot= any +anj+act;
        double mtot = mny + mnj + mct;
        input.close();
        double tot = mtot + atot;
        NumberFormat percent = NumberFormat.getPercentInstance();
        double awbrey = (atot)/(any+act+anj+mny+mct+mnj);
        double martinez = (mtot)/(any+act+anj+mny+mct+mnj);
        System.out.println("Canidate\tVotes  Percentage");
        System.out.println("Awbrey\t\t"+atot+"\t\t" + percent.format(awbrey));
        System.out.println("Martinez\t"+ mtot + "\t" + percent.format(martinez));
        System.out.println("TOTAL VOTES:"+ tot);


    }
}