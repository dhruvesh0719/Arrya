//Programme to display numbers divided by 3 and 5 separately between 1 and 100

public class NumbersDividedBy3and5
{
    public static void main(String[] args)
    {

        System.out.println("The Numbers Divided by 3 are: ");
        for(int i=1; i<=100; i++) // for loop to run till 100 numbers
        {
            if (i%3 == 0) //check condition to divide by 3
            {
                System.out.print(i+" ");
            }

        }

        System.out.println(); // make another line for divided by 5

        System.out.println("The Numbers Divided by 5 are: ");
        for(int i=1; i<=100; i++) // for loop to run till 100 numbers
        {
            if (i%5 == 0) //check condition to divide by 5
            {
                System.out.print(i+" ");
            }

        }
    }
}
