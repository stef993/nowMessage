/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author Mrk
 */
public class UserViewer {
    
    /**
     * Questo metodo permette di mostrare le informazioni relative al profilo utente
     * @param user 
     */
    public void showUser(LocalUser user){
        System.out.println("\n**Profilo Utente**");
        System.out.println(user);
    }
    
}
