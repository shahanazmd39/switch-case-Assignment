import java.util.Scanner;
 
public class EvenOrOdd 
{
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        int rem=num%2;
        switch(rem) 
        {
        
            case 0:
                    System.out.println(num + " is a EVEN Number");
                    break;
            default:
                    System.out.println(num + " is ODD Number");
        }
    }
}