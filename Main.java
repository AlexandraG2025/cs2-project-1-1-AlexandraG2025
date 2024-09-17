public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // Problem 1
      int speedKmS = 10; // KM PER SEC
      int speedKmMin = speedKmS * 60;
      int speedKmHr = speedKmMin * 60;
      int timeDistance = speedKmHr;
      System.out.println("It would take " + timeDistance + " hours to reach the moon");

      // Promlem 2
      int horizontal = 2000 * 2000; 
      int vertical = 3000 * 3000;
      int squareSpeed = horizontal * vertical;
      System.out.println(squareSpeed);
      // use Math.sqrt() to get the final answer 







   }
}
