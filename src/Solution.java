import java.util.*;
public class Solution {
    public static void main(String[] args) {

        // Area of Circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println("The area of circle is "+ area);


        //  Area of Square;
        System.out.print("Enter side of square : ");
        int side = sc.nextInt();
        int Area = side*side;
        System.out.println("The area of square is : " + Area);


        // Average of three Nums

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("The average of three numbers is : "+ avg);


        // Perimeter Of Rectangle

        System.out.print("Enter length of rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter width of rectangle : ");
        int width = sc.nextInt();
        int perimeter = 2 * (length+width);
        System.out.println("The perimeter of rectangle is: " + perimeter);

        // Product of Two Numbers

        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("Enter another number : ");
        int y = sc.nextInt();
        System.out.println("The product of numbers is " + (x*y));

        // Sum of Two numbers
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("The sum is : " + (num1+num2));


        // Total Cost of Pen Books and registers

        System.out.print("Enter cost of pen: ");
        float pen_cost = sc.nextFloat();
        System.out.print("Enter cost of book: ");
        float book_cost = sc.nextFloat();
        System.out.print("Enter cost of register: ");
        float register_cost = sc.nextFloat();
        float gst = (pen_cost/100)*18f+(book_cost/100)*18f+(register_cost/100)*18f;
        float Total_cost = gst +pen_cost+book_cost+register_cost;
        System.out.println("The total cost of items is : "+ Total_cost);
    }
}
