/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logutentemain;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ricci.davide
 */
public class LogUtenteMain {

    /**
     * @param args the command line arguments
    
     */
    public static void main(String[] args) throws IOException {
        
         FileManager fm = new FileManager();
         Controlli c = new Controlli();
         

         ArrayList<Log> listaLog = fm.leggiFile("LogAccessi.csv");
         c.contaFail(listaLog);
         c.segnalaIPsospetti(listaLog);
      // c.ordinaPerTimestamp(listaLog);

    /*for (int i = 0; i < listaLog.size(); i++) 
    {
    System.out.println(listaLog.get(i).getTimestamp());
    }
    */
  }
    
}
