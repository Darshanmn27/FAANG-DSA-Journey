public  class Patterns 
{

    public  static   void pat1()
    {
        System.out.println("patttern1: ");
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    public   static   void pat2()
    {
        System.out.println("pattern2 :");
        int num=6;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public   static   void pat3()
    {
        System.out.println("pattern3 :");
        int num=6;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public   static   void pat4()
    {
        System.out.println("pattern4 :");
        int num=6;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public   static   void pat5()
    {
        System.out.println("pattern5 :");
        int num=6;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public   static   void pat6()
    {
        System.out.println("pattern6 :");
        int num=6;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public  static  void pat7()
    {
        System.out.println("pattern number 7: ");
        int num=5;
        for(int i=0;i<num;i++)
        {
            //space 
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }


            //space
           for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public  static  void pat8()
    {
        int num=5;
        System.out.println("reverse  diamond pattern");
        for(int i=num;i>=0;i--)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }


            //space
           for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public  static   void pat9()
    {
        System.out.println("combination of 7  and  8 :");
        int num=5;
        for(int i=0;i<num;i++)
        {
            //space 
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }


            //space
           for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=num-1;i>=0;i--)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }


            //space
           for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public   static   void  pat10()
    {
        int num=6;
        System.out.println("pattern number 10: ");
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=num;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public   static  void  pat11binarytrianglepattern()
    {
        System.out.println("pattern number 11:");
        int num=5;
        for(int i=1;i<=num;i++)
        {
            int start=(i%2==0)?0:1;

            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }


    public  static  void pattern12()
    {
        System.out.println("pattern number 12 :");
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"");
            }
            for(int j=i;j<num;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public  static  void pattern13()
    {
        System.out.println("pattern  number 13: ");
        int num=5;
        int count=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public  static  void pattern14()
    {
        System.out.println("pattern  number  14 : ");
        for(int i=1;i<5;i++)
        {
            for(char c='A';c<='A'+i;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public  static  void pattern15()
    {
        System.out.println("pattern  number  15 : ");
        for(int i=5;i>=1;i--)
        {
            for(char c='A';c<='A'+i;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public  static  void pattern16()
    {
        System.out.println("pattern  number  16 : ");
        for (int i = 0; i < 5; i++) 
        { 
            char ch = (char) ('A' + i); // Convert to character
            for (int j = 0; j <= i; j++) 
            { 
                System.out.print(ch+" "); 
            }
            System.out.println(); // Move to next line
        }
    }

    public   static  void pattern17()
    {
        System.out.println("pattern 17 ;");
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print increasing part
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }

            // Print decreasing part
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println(); // Move to next line
        }
    }

    public  static  void pattern18()
    {
        System.out.println("pattern 18: ");
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) 
        {
            char ch = (char) ('E' - i); // Start from 'E' and decrement
            for (int j = 0; j <= i; j++) 
            {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println(); // Move to the next line
        }

    }

    public  static  void pattern19()
    {
        int n = 5; // Number of rows
        System.out.println("pattern  number  19:");

        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (n - i - 1) * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i != n - 1 || j != i) // Avoid double printing in the last row
                    System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (n - i - 1) * 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern20printPascal(int n) 
    {
        System.out.println("pattern");
        for (int i = 0; i < n; i++) 
        {
            int number = 1; // First element is always 1
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Compute next binomial coefficient
            }
            System.out.println();
        }
    }
        public   static  void  main (String ar[])
        {
            pat1();
            pat2();
            pat3();
            pat4();
            pat5();
            pat6();
            pat7();
            pat8();
            pat9();
            pat10();
            pat11binarytrianglepattern();
            pattern12();
            pattern13();
            pattern14();
            pattern15();
            pattern16();
            pattern17();
            pattern18();
            pattern19();
            pattern20printPascal(3);

        }
        
}
