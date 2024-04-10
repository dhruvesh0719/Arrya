//Programme to arrange array in ascending order

public class AscendingArray
{
    public static void main(String[] args)
    {
        int[] a = {2,5,1,7,9};
        int swap = 0;

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++ )
            {
                if(a[i]>a[j])
                {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;

                }
            }
        }

        System.out.println("Arry in ascending order:");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
