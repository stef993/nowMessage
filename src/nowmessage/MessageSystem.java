/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author Mrk
 * Classe che fungerà da controllore per la gestione dei messaggi.
 * Sara' una classe singleton, in modo da avere un unico controller per i
 * messaggi all'interno del programma
 */
public class MessageSystem {
    
    private static MessageSystem messageController;
    
    /**
     * constructor
     */
    private MessageSystem(){
        
    }
    
    //methods
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata.
     * @return l'istanza del controller
     */
    public static MessageSystem getIstance(){
        if(MessageSystem.messageController == null){
            MessageSystem.messageController = new MessageSystem();
        }
        return MessageSystem.messageController;
    }
}
