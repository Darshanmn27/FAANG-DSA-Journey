import java.util.*;
public class numbertowords 
{



    public static void main(String[] args) 
    {

        int num=1948;
        String  units[]={"","one","two","three","four","five","six","seven","eight","nine"};
        String teens[]={"","eleven","twelve","thirteen","foursteen","fifteen","sixteen","sventeen","eighteen","nineteen"};
        String tens[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","ninety"};
        String hundreds[]={"","hundred"};
        String thousand[]={"","thousand"};
        String res="";

        if(num/1000>0)
        {
            res=res+units[num/1000]+" thousand"+" ";
            num=num%1000;
        }
        if(num/100>0)
        {
            res=res+units[num/100]+"hundred"+" ";
            num=num%100;
        }
        if(num>0)
        {
            if(num>=11&&num<=19)
            {
                res=res+teens[num-1]+" ";
            }
            else
            {
                res=res+tens[num/10]+" ";
                res=res+units[num%10]+" ";
            }
        }
        else
        {
            res.trim();
        }
        
     
        
        System.out.println(res);
    }

    
}