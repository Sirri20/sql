import java.util.*;
public class reverse{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] ar=new int[N];
    for(int i=0;i<N;i++)
    {
        ar[i]=s.nextInt();
    }
    for(int i=N-1;i>=0;i--)
    {
        System.out.print(ar[i]+" ");
    }
}
}
