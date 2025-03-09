import java.util.*;
public class perfectsqure_ugly 
{


    public static void isperfectsqure()
    {
        int N = 25;
        boolean isPerfectSquare = false;

        for (int i = 1; i <= N; i++) 
        {
            if (i * i == N) {
                isPerfectSquare = true;
                break;
            }
        }
        System.out.println(isPerfectSquare);
    }


    public static boolean chcek_ugly_number()
    {
        int num=306;
        while (num%2==0)
        {
            num=num/2;
        }
        while (num%3==0) 
        {
            num=num/3;
        }
        while (num%5==0)
        {
            num=num/5;
            
        }
        return num==1;
    }

    public static void main(String[] args) 
    {
        isperfectsqure();
        System.out.println(chcek_ugly_number());
        
    }

    
}