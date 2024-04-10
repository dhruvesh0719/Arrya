//Programme to check given number is Armstrong number or not

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int b = a;
        int l = a;
        int c = 0;
        int cout = 1;
        int num = 0;
        int rev;
        int swap = 1;

        for(int i=0; i<=a; i++)
        {
            num = num * 10 + a % 10;
            a = a / 10;
            cout++;
        }

        while (b > 0)
        {
            rev = b % 10;
            for(int i=0; i<cout; i++)
            {
                swap = swap * rev;
            }
            c = c + swap;
            swap = 0;
            b = b/10;
        }


        if (c == l)
        {
            System.out.println("The number is Armstrong number");
        }else {
            System.out.println("The number is not Armstrong number");
        }
    }
}
