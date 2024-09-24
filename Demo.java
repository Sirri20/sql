import java.util.scanner;
public class Demo
{
    public static void main (String[] args )
    {
        scanner scanner=new scanner(System.in);
        int n=scanner.nextInt();
        int[] ar=new int [n];
        for(int i=0;i<n;i++)
        {
            ar[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        findLastOccurance(ar,k);
    }
    public static void findLastOccurance(int ar[],int k)
    {
        int index=0;
        for(int  i=0;i<ar.length;i++)
        {
            if(ar[i]==k)
            {
                index=i
            }
        }
        
        if(index>=1)
        {
            System.out.print(index);
        }
        else
        {
            System.out.print(-1)
        }



    }


}