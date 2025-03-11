public class Sliding 
{

    public  static void subarraysum()
    {
        int arr[]={2,4,7,1,6,3};
        int k=3;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            max=Math.max(max, arr[i]);
        }
        
    }


    public  static int fibanocci(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }

    public  static void range()
    {
        int num=5;
        int a=0,b=1;
        System.out.print(a+" "+ b);
        int sum=a+b;
        for(int i=0;i<num-2;i++)
        {
            int next=a+b;
            System.out.print(" "+next+" ");
            sum=sum+next;
            a=b;
            b=next;
        }
        System.out.println("fibanocci  sum :"+sum);
    }


    public static void main(String[] args) 
    {
        subarraysum();
        System.out.println(fibanocci(6));
        range();
        
    }
    
}
