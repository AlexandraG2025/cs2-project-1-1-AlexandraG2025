public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // Problem 1
      int speedKmS = 10; // KM PER SEC
      int speedKmMin = speedKmS * 60;
      int speedKmHr = speedKmMin * 60;
      int timeDistance = speedKmHr;
      System.out.println("It would take " + timeDistance + " hours to reach the moon");

      // Problem 2
      int horizontal = 2000 * 2000; // b squared
      int vertical = 3000 * 3000; //a squared
      int aPlusB = horizontal + vertical;
      double totalSpeed = Math.sqrt(aPlusB);
      System.out.println(totalSpeed); 
      // use Math.sqrt() to get the final answer 


      // Problem 3
      //3A
      int radiusM = 1731 * 1000; // converted to meters
      int radiusSquared = radiusM * radiusM; 
      double surfaceArea = 4 * Math.PI * radiusSquared;
      double volume = surfaceArea * 0.001; // converted to mm
      System.out.println(volume);

      //3B
      










   }
}
