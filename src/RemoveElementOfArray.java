//Programme to remove a specific element from array

import java.util.Arrays;

public class RemoveElementOfArray
{
    public static void main(String[] args)
    {
        int[] a = {3,5,2,5,6};
        int[] b = new int[a.length-1];
        int remove = 2;

        for(int i=0, k=0; i<a.length; i++)
        {
            if(i != remove)
            {
                b[k] = a[i];
                k++;
            }
        }
        System.out.println("The original array is : "+ Arrays.toString(a));
        System.out.println("The array after removing specific element is : "+Arrays.toString(b));
    }
}
