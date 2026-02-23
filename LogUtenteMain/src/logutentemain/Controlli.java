/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logutentemain;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Utente
 */
public class Controlli {
    
    public Controlli()
    {
        
    }
    

public void contaFail(ArrayList<Log> listaLog) {

    for (int i = 0; i < listaLog.size(); i++) {

        String utente = listaLog.get(i).getUsername();
        int contatore = 0;
        boolean giaControllato = false;

        
        for (int j = 0; j < i; j++) {
            if (listaLog.get(j).getUsername().equals(utente)) {
                giaControllato = true;
                break;
            }
        }

        if (!giaControllato) {

            for (Log log : listaLog) {
                if (log.getUsername().equals(utente) && !log.isEsito()) {
                    contatore++;
                }
            }

            System.out.println(utente + " FAIL: " + contatore);
        }
    }
   }
public void segnalaIPsospetti(ArrayList<Log> listaLog){
    
    String ipCorrente = "";
    int contatoreFail = 0;

    for (Log log : listaLog) {

        if (log.getIp().equals(ipCorrente) && !log.isEsito()) {
            contatoreFail++;
        } else {
            ipCorrente = log.getIp();
            if (!log.isEsito()) {
                contatoreFail = 1;
            } else {
                contatoreFail = 0;
            }
        }

        if (contatoreFail >= 3) {
            System.out.println("IP sospetto: " + ipCorrente);
        }
    }

}
public void ordinaPerTimestamp(ArrayList<Log> listaLog) {

    Collections.sort(listaLog,
        (l1, l2) -> l1.getTimestamp().compareTo(l2.getTimestamp())
    );
}
    
}

