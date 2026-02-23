/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logutentemain;

/**
 *
 * @author Utente
 */
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Log {
    
    private String username;
    private String ip;
    private boolean esito;
    private LocalDateTime timestamp;

    public Log(LocalDateTime timestampc,String username, String ip, boolean esito ) {
        this.username = username;
        this.ip = ip;
        this.esito = esito;
        this.timestamp = timestamp;
    }

    

    public String getUsername() {
        return username;
    }

    public String getIp() {
        return ip;
    }

    public boolean isEsito() {
        return esito;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
   
}


