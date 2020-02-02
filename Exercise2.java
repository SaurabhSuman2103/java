import java.util.Scanner;
public class Exercise2 {
    int calculateDifference()
    {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum=sum+(i*i);
        }
        int sq=0;
        for(int i =1;i<=a;i++)
        {
            sq=sq+(i);
        }
        sq=sq*sq;
        int diff=sum-sq;
        return diff;
    }

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        System.out.println(obj.calculateDifference());
    }
}
