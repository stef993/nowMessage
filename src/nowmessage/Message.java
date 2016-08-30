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
public class Message {
    
    private String text;
    private Media attachment;
    private Integer stateMsg;

    /**
     * Constructor
     * @param text indica il testo del messaggio da creare
     */
    public Message(String text) {
        
        this.text = text;
        this.stateMsg=0;
    }
    
    /**
     * Constructor
     * @param text indica il testo del messaggio da creare
     * @param attachment indica l'allegato multimediale del messaggio da creare
     */
    public Message(String text, Media attachment) {
        
        this.text = text;
        this.attachment = attachment;
    }

    //methods
    

    /**
     * Questo metodo permette di conoscere il testo del messaggio
     * @return il testo del messaggio
     */
    public String getText() {
        return text;
    }

    /**
     * Questo metodo permette di settare il testo del messaggio
     * @param text 
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Questo metodo permette di conoscere l'allegato del messaggio
     * @return l'allegato
     */
    public Media getAttachment() {
        return attachment;
    }

    /**
     * Questo metodo permette di settare l'allegato del messaggio
     * @param attachment indica l'allegato
     */
    public void setAttachment(Media attachment) {
        this.attachment = attachment;
    }

    /**
     * Questo metodo permette di conoscere lo stato del messaggio
     * @return lo stato
     */
    public Integer getStateMsg() {
        return stateMsg;
    }

    /**
     * Questo metodo permette di settare lo stato del messaggio
     * @param stateMsg indica il nuovo stato del messaggio
     */
    public void setStateMsg(Integer stateMsg) {
        this.stateMsg = stateMsg;
    }
    
    /**
     * Questo metodo permette di avere una rappresentazione testuale dell'oggetto Message
     * @return la stringa associata
     */
    @Override
    public String toString(){
        return  "\nTesto: " + text
                + "\nAllegato: " + attachment
                + "\nStato: " + stateMsg;
    }
    
}
