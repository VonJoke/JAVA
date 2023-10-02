// java.lang.String
// java.util.Random
// java.util.concurrent.atomic.AtomicInteger
// java.nio.file.Files
// java.nio.file.Paths
// java.util.Date
// java.sql.Date

package src.base; // La classe si trova in \src\base

public class Base { // La classe omonima verrà automaticamente definita pubblica e le altre private

   public Base() { // Il costruttore non ha ritorno e viene eseguito per ultimo
      System.out.println("Base: Online");
   }

   private String id;
   { System.out.println("Base: Data initialized"); }

   public Base(String iniId) {
      id = iniId;
      System.out.println("Base: Online (id: " + id + ")");
   }

   public String getId() {
      return id;
    }
   public void setId(String newId) {
      id = newId;
   }
}

