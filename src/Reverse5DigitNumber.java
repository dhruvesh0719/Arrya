//Programme to reverse given number

import java.util.Scanner;

public class Reverse5DigitNumber
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 5 Digit number");
        int a = scanner.nextInt();
        int b = a;
        int cout = 1;
        int num = 0;
        int rev = 0;

        for(int i=0; i<=a; i++)
        {
            num = num * 10 + a % 10;
            a = a / 10;
            cout++;
        }

            if (cout >= 5)
            {
                while (b != 0)
                {
                    rev = rev * 10 + b % 10;
                    b = b / 10;
                }
                System.out.println("The Reverse number is: " + rev);

            } else {
                System.out.println("Please enter the 5 digit number");
            }

    }
}
