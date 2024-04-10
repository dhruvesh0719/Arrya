//Programme to find common element from both arrays

public class CommonElementsOfArrays
{
    public static void main(String[] args)
    {
        String[] arry1 = {"delhi","mumbai","chennai","dhruv","vipul"};
        String[] arry2 = {"chiman","magan","chagan","dhruv","vipul"};

        System.out.println("The common elements between two arrays are:");

        for(int i=0; i<arry1.length; i++)
        {
            for(int j=0; j<arry2.length; j++)
            {
              if(arry1[i] == arry2[j])
              {
                  System.out.println(arry1[i]);
              }
            }
        }

    }
}
