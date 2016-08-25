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
    
    /**
     * Questo metodo permette di creare un messaggio di testo
     * @param sender indica il mittente
     * @param receiver indica il destinatario
     * @param text indica il testo del messaggio
     * @return il messaggio creato
     */
    public Message newMessage(Contact sender, Contact receiver, String text){
        //1- richiamare costruttore della classe messaggio
        return null;
    }
    
    /**
     * Questo metodo permette di creare un messaggio multimediale
     * @param sender indica il mittente
     * @param receiver indica il destinatario
     * @param text indica il testo del messaggio
     * @param attachment indica il media l'allegato
     * @return il messaggio creato
     */
    public Message newMessage(Contact sender, Contact receiver, String text, Media attachment){
        //1- richiamare il costruttore della classe messaggio
        return null;
    }
    
    /**
     * Questo metodo permette di eliminare un messaggio
     */
    public void deleteMessage(){
        
    }
    
    /**
     * Questo metodo permette di inviare un messaggio precedentemente creato
     * @param msg indica il messaggio da creare
     */
    public void sendMessage(Message msg){
        //forse da implementare
    }
    
    /**
     * Questo metodo permette di ricevere un messaggio
     */
    public void receiveMessage(){
        
    }
    
    /**
     * Questo metodo permette di archiviare un messaggio
     */
    public void archiveMessage(){
        
    }
    
    /**
     * Questo metodo permette di esportare un messaggio su disco
     */
    public void exportMessage(){
        
    }
    
    /**
     * Questo metodo permette di importare un messaggio dal disco
     */
    public void importMessage(){
        
    }
    
    
}
