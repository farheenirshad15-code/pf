import java.util.Scanner;
public class numbersloop {
    public static void main(String[] args) {
               Scanner input=new Scanner(System.in);
        int num1,num2;
        int num3=4;
        System.out.println("Enter number 1:");
   num1=input.nextInt();
        
          System.out.println("Enter number 2:");
         num2=input.nextInt();
        
        if (num1<num2){
       System.out.println(num1);
       
       }
        
        else {
  System.out.println("number is invalid!");      
       }
     
        while(num1+num3<num2)
            {
        num1=(num1+num3);
        System.out.println(num1);
     };
        input.close();
    
}
}
