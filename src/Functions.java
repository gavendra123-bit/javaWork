import java.util.*;
public class Functions {
    public static float avgOfThree(int a, int b, int c){
        int sum = a+b+c;
        float avg;
        avg= sum/3;
        return avg;
    }


    public static int Factorial(int a){
        int fact = 1;
        for (int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int BinoCoeff(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int BC = fact_n/(fact_r*fact_nmr);
        return BC;
    }


        public static boolean IsPrime(int a) {
            boolean isprime = true;
            if (a == 2) {
                return isprime;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isprime = false;
                    return isprime;
                }
            }
            return isprime;
        }

    public static int Factorials(int a){
        int fact=1;
        for (int i =1;i<=a; i++){
            fact=fact*i;
        }
        return fact;
    }




    public static int BinomialCoeffi(int n,int r){
        int fact1=1;
        int fact2=1;
        for(int i=1;i<=n; i++){
            fact1= fact1*i;
        }
        for(int i=1;i<=r; i++){
            fact2 = fact2*i;
        }
        int fact3=1;
        for(int i=1;i<=n-r; i++){
            fact3 = fact3*i;
        }
        int coeff = fact1/(fact2*fact3);
        return coeff;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int res1 = BinoCoeff(n, r);
        System.out.println("The binomial Coefficient is = " + res1);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();
        float res = avgOfThree(a, b, c);
        System.out.println("The average of given numbers are : " + res);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        boolean res2 = IsPrime(n1);
        if (res2 == true) {
            System.out.println("The given number is a prime number.");
        } else {
            System.out.println("The given number is not a prime number.");
        }
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact=Factorials(num);
        System.out.println("The factorial of given number is = " + fact);

        int n2 = sc.nextInt();
        int r1 = sc.nextInt();
        int res3 = BinomialCoeffi(n, r);
        System.out.println("The Binomial Coefficient of given numbers is : " + res3);
    }
}
