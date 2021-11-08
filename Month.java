import java.util.Scanner;

public class Month 
{
	public static void main(String args[]) 
    {
        Scanner cherry = new Scanner(System.in);
        System.out.println("Enter the first three letters of the month");
        String month = cherry.next();
        switch(month)
        {
        case "Jan":
        System.out.println(" January");
        break;
        case "feb":
        System.out.println("Feburary ");
        break;
        case "mar":
        System.out.println(" March");
        break;
        case "apr":
        System.out.println(" April");
        break;
        case "may":
        System.out.println(" May");
        break;
        case "jun":
        System.out.println(" June");
        break;
        case "jul":
        System.out.println(" July");
        break;
        case "aug":
        System.out.println(" August");
        break;
        case "sep":
        System.out.println(" September");
        break;
        case "oct":
        System.out.println(" October");
        break;
        case "nov":
        System.out.println(" November");
        break;
        case "dec":
        System.out.println("December ");
         
        default:
        System.out.println("Incorrect month");
        }
    }
        
}


