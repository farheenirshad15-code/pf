public class starPattern {
    public static void main(String[] args) {
       for(int i=0; i<5; i++){
        for (int j=0; j<=i; j ++){
            System.out.print("*");
        }
        System.out.println();
       }
       // its reverse would be 
       System.out.println("Reverse of the above pattern is: ");
       for(int a=0; a<5; a++){
        for (int b=0; b<5-a; b ++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
