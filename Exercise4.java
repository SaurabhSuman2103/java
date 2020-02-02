import java.util.Scanner;

public class Exercise4 {
    boolean checkNumber()

    {
        //Checks if the entered number is a power of two or not
        int n;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        boolean result;
        if(Math.ceil(Math.log10(n)/Math.log10(2))==Math.floor((Math.log10(n)/Math.log10(2))))
        result=true;
        else
            result =false;
        return result;
    }

    public static void main(String[] args) {
        Exercise4 ob=new Exercise4();
        System.out.println(ob.checkNumber());
    }
}
