import java.util.Scanner;
public class decimal{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a decimal number:");
        String a=input.next();
        int bd,ad;
        bd=a.indexOf(".");
        System.out.println("before decimal the digits are:"+bd);
        int f=a.length();
        ad=f-bd-1;
        System.out.println("digits after decimal are:"+ad);
        input.close();
    }
}
