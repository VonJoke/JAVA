// COMPILAZIONE: javac src\base\Base.java src\base\Base2.java src\Demo.java -d classes
// AVVIO: cd classes & java Demo Demo-ID & cd ..
// ARCHIVIAZIONE: jar -cvf demo.jar .

/* JDK, JRE E COMANDI
 * Java Development Kit: contiente il software necessario allo sviluppo di applicazioni java inclusi i seguenti comandi:
 * javac: converte il codice sorgente (.java) in bytecode (.class) eseguibile così dal comando java.
 * java: esegue il programma e avvia la Java Virtual Machine prima dell'esecuzione del codice in quanto la KVM riesce ad eseguire il bytecode.
 * jar: archivia i file in un pacchetto.
 * javadoc: genera la documentazione.
 * 
 * Java Runtime Environment: è un sottoinsieme della JDK usato per eseguire programmi ma non per compilarli, ormai in disuso.
 * 
 * Integrated Development Environment: software di sviluppo multicodice per l'integrazione di funzionalità di programmazione.
 */

/* COMANDO PER LA VERSIONE JAVA:
 * javac -version oppure java -version
 */

/* ALTRO:
 * Java.lang è automaticamente importato con l'intero contenuto
 * Non è possibile utilizzare import di classi omonime, per farlo occorre esplicirarlo nella dichiarazione delle variabili
 */

import src.base.*; // Importa le classi contenute in src\base\

public class Demo {
   public static void main(String[] args) {
      System.out.println("");

      Base demo = new Base(); // Istanzia un oggetto demo della classe Base
      demo.setId(args[0]); // Imposta l'ID da riga di comando
      Base demo1 = new Base("Cos-ID"); // Istanzia un oggetto demo della classe Base e imposta l'ID da costruttore

      Base2 demo2 = new Base2(); // Istanzia un oggetto demo della classe Base 2

      // Visualizzazione
      System.out.println("\n***");
      System.out.println("(Base > obj 1) " + demo.getId()); // Ottiene l'ID con metodo pubblico in quanto variabile privata
      System.out.println("(Base > obj 2) " + demo1.getId()); // Ottiene l'ID con metodo pubblico in quanto variabile privata
      System.out.println("(Base 2 > obj 1) " + demo2.randomNumber); // Accesso diretto al membro in quanto variabile pubblica
      System.out.println("***");
   }
}
