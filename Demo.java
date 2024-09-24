import java.util.*;
public class Demo
{
    public static void main (String[] args )
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int [n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findLastOccurance(ar,k);
    }
    public static void findLastOccurance(int ar[],int k)
    {
        int index=0;
        for(int  i=0;i<ar.length;i++)
        {
            if(ar[i]==k)
            {
                index=i;
            }
        }
        
        if(index>=1)
        {
            System.out.print(index);
        }
        else
        {
            System.out.print(-1);
        }



    }


}