import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
float a=0;
       System.out.println("Enter marks of programming fundamentals:"+a);
       a=input.nextFloat();

    float b=0;
      System.out.println("Enter marks of ict:"+b);
    b=input.nextFloat();
    float c=0;
  System.out.println("Enter marks of calculus:"+c);
 c=input.nextFloat();
  
float d=0; 
  System.out.println("Enter marks of applied physics:"+d);
    d=input.nextFloat();
  float e=0;
 System.out.println("Enter marks of functional english:"+e);
e=input.nextFloat();
  float f=0;
 System.out.println("Enter marks of islamiat:"+f);
f=input.nextFloat ();
  
 float p=(a+b+c+d+e+f)/600 *100;

        if (p>=90 && p<=100) {
            System.out.println("you have gotten A+ grade,hurrayy!"+"and ur percentage is "+p);
              }
        else if(p>80 && p<=90
        )
        {
            System.out.println("you have gotten A grade,hurrayyy!"+p);
         }
         else if(p>=70 && p<=80)

{
            System.out.println("you have gotten B+ grade,hurrayyy!"+"and ur percentage is "+p);
        }
  else if(p>=60 && p<=70)
        {
            System.out.println("you have gotten B grade,hurrayyy!"+"and ur percentage is "+p);
        }
  else if(p>=50 && p<=60)
        {
            System.out.println("you have gotten C grade,hurrayyy!"+"and ur percentage is "+p);
        }
  else if(p>=40 && p<=50)
        {
            System.out.println("you have gotten D grade,hurrayyy!"+"and ur percentage is "+p);
        }
  else if(p<40)
        {
            System.out.println("you have failed,better luck next time"+"and ur percentage is "+p);
        }
        input.close();
    }


    }
