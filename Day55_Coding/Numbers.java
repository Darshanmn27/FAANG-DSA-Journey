import  java.util.*;
public class Numbers 
{


    public  static  void  reverse()
    {
        int num=2027;
        int rev=0;
        int temp=num;

        while (num>0) 
        {

            int r= num%10;
            rev= rev*10+r;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("palindrome number ");
        }
        else
        {
            System.out.println("  not  palindrome number");
        }
    }



    public  static   boolean  isprime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public  static  void  rangeofprimenumbers()
    {
        for(int i=1;i<=100;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }


    public  static   void  nextprime()
    {
        int num=2030;
        num=num+1;
        while (!isprime(num)) 
        {
            num++;
        }
        System.out.println(num);
    }


    public  static  void  ceilprime()
    {
        System.out.println("ceiling of  a  prime  number  is ");
        int num=2026;
        //num=num;
        while (!isprime(num)) 
        {
            num--;
        }
        System.out.println(num);

    }


    public  static  boolean  powerofnumberornot(int num,int base)
    {
     while (num%base==0) 
     {
        num=num/base;
        
     }
     return num==1;
    }




    public  static   void  primefactors()
    {
        int num=90;
        System.out.println("prime  factors  are  are   given  number  is :");
        for(int i=2;i<=num;i++)
        {
            while (num%i==0) 
            {
                System.out.print(i+" ");
                num=num/i;
            }
        }
        if(num>1)
        {
            System.out.print(num+" ");
        }
    }



    public static void main(String[] args) 
    {
        reverse();
        System.out.println(isprime(2039));
        rangeofprimenumbers();
        nextprime();
        System.out.println();
        ceilprime();
        powerofnumberornot(25,5);
        primefactors();
        
    }
    
}
