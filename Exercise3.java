import java.util.Scanner;
import java.lang.String;
public class Exercise3 {
    boolean checkNumber()
    {
        // Check if a number is an increasing number
        boolean result=true;
        String n;
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        n=s.nextLine();
        for(int i=0;i<n.length()-1;i++)
        {
//            System.out.println(n.charAt(i));
            if(n.charAt(i)<n.charAt(i+1))
                result=true;
            else
                result=false;
        }
        return result;
    }

    public static void main(String[] args) {
    Exercise3 ob = new Exercise3();
        System.out.println(ob.checkNumber());
    }
}
