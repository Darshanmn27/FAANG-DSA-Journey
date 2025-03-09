import java.util.*;
public class LCM_HCF
{



    public static void hcfbrute()
    {
        int a=28,b=24;
        int min = Math.min(a, b);
        int hcf = 1;

        for (int i = 1; i <= min; i++) 
        {
            if (a % i == 0 && b % i == 0) 
            {
                hcf = i;
            }
        }
        System.out.println("hcf :"+hcf);


    }
    public static void main(String[] args) 
    {
        hcfbrute();
        
    }
}