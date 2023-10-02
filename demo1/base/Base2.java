package src.base; // La classe si trova in \src\base
import java.util.*; // Import multiplo con wildcard (Random)

public class Base2 {

   public Base2() { // Il costruttore non ha ritorno e viene eseguito per ultimo
      System.out.println("Base 2: Online");
   }

   Random random = new Random();
   public Integer randomNumber = random.nextInt(10); // Intero casuale 0-9
   { System.out.println("Base 2: Data initialized"); }
}
