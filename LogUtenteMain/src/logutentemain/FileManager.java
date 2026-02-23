/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logutentemain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author ricci.davide
 */


public class FileManager {
    
   

    public FileManager() {
        
    }
   
   
   
   public  ArrayList<Log> leggiFile(String nomeFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomeFile));
        String riga = br.readLine() ;
        
        ArrayList<Log> listaLog = new ArrayList<>();
        boolean succLog;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        while ((riga = br.readLine()) != null) {
            
             String[] parti = riga.split(",");
             LocalDateTime dataLog = LocalDateTime.parse(parti[0], formatter);
             
             if (parti[3].equals("OK")){
                 succLog = true;
             
             }
             else{
                 succLog = false;
             }
        Log log = new Log(dataLog,parti[1],parti[2],succLog);
        listaLog.add(log);
        }


        br.close();
        
        return listaLog;
        
    }
   
}
