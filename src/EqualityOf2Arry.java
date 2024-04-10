// Programme to check equality of two arrays

public class EqualityOf2Arry
{
    public static void main(String[] args)
    {

        int[] a = {3,5,2,5,6};
        int[] b = {3,2,5,1,3};
        boolean sameornot = true;

        if(a.length == b.length)
        {
            for(int i=0; i<a.length; i++)
            {
                if(a[i] == b[i])
                {
                sameornot = false;
                }
            }

        }else {
        sameornot = false;
        }

        if(sameornot)
        {
            System.out.println("Both Array are equal");

        }else {
            System.out.println("Both Array are not equal");
        }
    }
}
