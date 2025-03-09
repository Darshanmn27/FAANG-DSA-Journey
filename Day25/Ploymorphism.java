class Calculator 
{

    // Overloaded method - add two integers
    int add(int a, int b) 
    {
        return a + b;
    }

    // Overloaded method - add three integers
    int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    // Overloaded method - add two double values
    double add(double a, double b) 
    {
        return a + b;
    }
}

public class Ploymorphism

{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));    // Output: 15
        System.out.println(calc.add(5, 10, 15)); // Output: 30
        System.out.println(calc.add(5.5, 10.5)); // Output: 16.0
    }
}