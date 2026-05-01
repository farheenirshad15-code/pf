import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
       Scanner inp= new Scanner(System.in);
       System.out.print("Enter the side one: ");
       double side1 = inp.nextDouble();
       System.out.print("Enter the side two: ");
       double side2 = inp.nextDouble();
       System.out.print("Enter the side three: ");
       double side3 = inp.nextDouble();
       if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        if (side1==side2 && side2==side3) {
            System.out.println("The given sides form an Equilateral triangle");
        }
        else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("The given sides form an Isosceles triangle");
        }
        else {
            System.out.println("The given sides form a Scalene triangle");
        }
        inp.close();
    }
}}
