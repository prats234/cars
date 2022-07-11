import java.util.Scanner;
public class cars
{
    public static void main(String[] args)
    {
        System.out.println("Do you want to buy a new car..?");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        if (text.equals("yes")) {
            System.out.println("Which color is your favourite among Red-Blue-Green-Purple..?");
            String text2 = scan.next();
            if (text2.equals("Red") || text2.equals("red")) {
                System.out.println("Yes..We have it in stock would you like to see it..?");
                String text3 = scan.next();
                if (text3.equals("Yes") || text3.equals("yes")) {
                    System.out.println("ok we'll Show it to you..");
                }
            } else if (text2.equals("Blue") || text2.equals("blue")) {
                System.out.println("We Can't Provide it..This is out of Stock..");
            } else if (text2.equals("Green") || text2.equals("green")) {
                System.out.println("it is out of Stock..");
            } else if (text2.equals("Purple") || text2.equals("purple")) {
                System.out.println("Well..Good Choice..We'll provide it till tomorrow...");
            }
        }
        else if(text.equals("No") || text.equals("no"))
        {
            System.out.println("Okay..No worries..!!");
        }
        else
        {
            System.out.println("Please Choose correct option..!");
        }
    }
}
