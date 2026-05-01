public class evenOdd {
    public static void main(String[] args) {
      int evenCount = 0;
      int oddCount = 0;
      for (int i = 1; i <= 303; i++) {
          if (i % 2 == 0) {
              evenCount++;
          } else {
              oddCount++;
          }
      }
      System.out.println("Total even numbers between 1 and 300: " + evenCount);
      System.out.println("Total odd numbers between 1 and 300: " + oddCount);
    }
    }
