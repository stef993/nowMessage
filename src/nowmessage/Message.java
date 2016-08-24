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

    //constructor
    public Message(Contact sender, Contact receiver, String text, Media attachment) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.attachment = attachment;
    }

    public Message(Contact sender, Contact receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    //methods
    public Contact getSender() {
        return sender;
    }

    public void setSender(Contact sender) {
        this.sender = sender;
    }

    public Contact getReceiver() {
        return receiver;
    }

    public void setReceiver(Contact receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Media getAttachment() {
        return attachment;
    }

    public void setAttachment(Media attachment) {
        this.attachment = attachment;
    }

    public Integer getStateMsg() {
        return stateMsg;
    }

    public void setStateMsg(Integer stateMsg) {
        this.stateMsg = stateMsg;
    }
    
    
    
}
