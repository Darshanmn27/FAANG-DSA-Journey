import java.util.*;
public class SUM 
{

    public  static int  sumofcubes(Scanner sc)
    {
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++)
        {
            sum=sum+i*i*i;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum=sumofcubes(sc);
        System.out.println(sum);
        
    }
    
}
