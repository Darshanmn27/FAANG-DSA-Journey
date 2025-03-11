import java.util.*;
public class userinputs 
{

   /* public  static  void numbers(Scanner sc)
    {//  single  line  input integer input from the  command line 
    
    ✅ 1. Take Single Integer Input from User
    int num=sc.nextInt();
        System.out.println(num);
    }
    */

   /*  public  static  void numbers(Scanner sc)
    {
        /* ✅ 2. Take Multiple Space-separated Integers from User
        String input=sc.nextLine();
        String arr[]=input.split(" ");
        int numbers[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            numbers[i]=Integer.parseInt(arr[i]);
        }
        System.out.println("numbers are :");
        for(int num:numbers)
        {
            System.out.print(num+" ");
        }
        

       
    }
        */
        /* public  static  void commaseparated(Scanner ss)
        {
           ✅ 3. Take Comma-separated Integers from User 
            String sss= ss.nextLine();
            String arr[]=sss.split(",");
            int nums[]=new int[arr.length-1];
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=Integer.parseInt(arr[i]);
            }
            System.out.println("elements are :");
            for(int num:nums)
            {
                System.out.print(num+" ");
            }

        }
            */


           /* public  static  void  stringinput(Scanner tt)
            {

                //✅ 4. Take String Input from User
                String ss=tt.nextLine();
                System.out.println("hello"+ss);

            }
                 */

          /*  public  static  void  stringinput(Scanner tt)
            {
                //✅ 5. Take String Array Input (Space-separated) from User
                String ss=tt.nextLine();
                String arr[]= ss.split(" ");
               // String names[]=new String[arr.length];
                for(String nn:arr)
                {
                    System.out.print(nn+" ");
                }
               // System.out.println("hello"+ss);

            }
                */
           
           /*     public  static  void  commastringinput(Scanner tt)
            {
                //✅ 6. Take String Array Input (Comma-separated) from User
                String ss=tt.nextLine();
                String arr[]= ss.split(",");
               // String names[]=new String[arr.length];
                for(String nn:arr)
                {
                    System.out.print(nn+" ");
                }
               // System.out.println("hello"+ss);

            }
                */


                public static  void squarebrackest(Scanner ss)
                {
                    String input=ss.nextLine();
                    input=input.replace("[", "").replace("]", "");
                    String arr[]=input.split(" ");
                    int numbers[]= new int[arr.length];
                    for(int i=0;i<arr.length;i++)
                    {
                        numbers[i]=Integer.parseInt(arr[i].trim());
                    }
                    System.out.println("array  elements  are :");
                    for(int num:numbers)
                    {
                        System.out.print(num+" ");
                    }

                }

    public  static void main(String args[])
    {
        Scanner ss=  new Scanner(System.in);
       // numbers(ss);
       //commaseparated(ss);
      // stringinput(ss);
     // stringinput(ss);
     //commastringinput(ss);
     squarebrackest(ss);
     /*
      * 
      Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        char grade = input[3].charAt(0);
        String gender = input[4];

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Gender: " + gender);
      */

    }
    
}
