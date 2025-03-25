import  java.util.*;
public  class Rec_fact 
{

    public  static  void basecase(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println("darshan good  morning ");
        basecase(num-1);
    }

    public  static  void count(int count)
    {
        if(count==50)
        {
            return;
        }
        System.out.println(count+4);
        count=count+5;
        count(count-1);


    }

    public  static void main(String ar[])
    {
        //fact();
        basecase(5);
        count(6);

    }

    
}