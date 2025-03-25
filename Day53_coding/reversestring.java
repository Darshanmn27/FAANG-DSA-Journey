public class reversestring 
{

    public   static boolean  ispali(String str,int start,int end)
    {
        if (start>=end) 
        {
            return true;
        }
        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }
        return ispali(str, start+1, end-1);

    }

    public static void main(String[] args) 
    {
        String s="malayalam";
        int start=0,end=s.length()-1;
        System.out.println(ispali(s, start, end));
        
    }
    
}
