/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowMessage;

/**
 *
 * @author anto
 */
public class NowMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainSystem main = MainSystem.getInstance(); //crea l'unica istanza del MainSystem nel programma
                
        //inizio esecuzione
        main.startSystem();
    }
    
}
