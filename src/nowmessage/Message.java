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
    
    private Contact sender;
    private Contact receiver;
    private String text;
    private Media attachment;
    private Integer stateMsg;

    /**
     * Constructor
     * @param sender indica il mittente del messaggio da creare
     * @param receiver indica il destinatario del messaggio da creare
     * @param text indica il testo del messaggio da creare
     */
    public Message(Contact sender, Contact receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }
    
    /**
     * Constructor
     * @param sender indica il mittente del messaggio da creare
     * @param receiver indica il destinatario del messaggio da creare
     * @param text indica il testo del messaggio da creare
     * @param attachment indica l'allegato multimediale del messaggio da creare
     */
    public Message(Contact sender, Contact receiver, String text, Media attachment) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.attachment = attachment;
    }

    //methods
    
    /**
     * Questo metodo permette di conoscere il mittente del messaggio
     * @return il mittente
     */
    public Contact getSender() {
        return sender;
    }

    /**
     * Questo metodo permette di settare il mittente del messaggio
     * @param sender indica il mittente
     */
    public void setSender(Contact sender) {
        this.sender = sender;
    }

    /**
     * Questo metodo permette di conoscere il destinatario del messaggio
     * @return il destinatario
     */
    public Contact getReceiver() {
        return receiver;
    }

    /**
     * Questo metodo permette di settare il destinatario del messaggio
     * @param receiver indica il destinatario
     */
    public void setReceiver(Contact receiver) {
        this.receiver = receiver;
    }

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
    
    
    
}
