/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author Mrk
 * Classe che fungerà da controllore per la gestione del profilo utente.
 * Sara' una classe singleton, in modo da avere un unico controller per il
 * profilo utente all'interno del programma
 */
public class UserSystem {
    
    private static UserSystem userController;
    
    /**
     * constructor
     */
    private UserSystem(){
        
    }
    
    //methods
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata.
     * @return l'istanza del controller
     */
    public static UserSystem getIstance(){
        if(UserSystem.userController == null){
            UserSystem.userController = new UserSystem();
        }
        return UserSystem.userController;
    }
}
