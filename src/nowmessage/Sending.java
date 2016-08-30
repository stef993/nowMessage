/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.util.ArrayList;

/**
 *
 * @author anto
 */
public class Sending {
    
    private ArrayList<Contact> receiverList;
    private Message message;

    public Sending(ArrayList<Contact> receiverList, Message message) {
        this.receiverList = receiverList;
        this.message = message;
    }

    public ArrayList<Contact> getReceiverList() {
        return receiverList;
    }

    public void setReceiverList(ArrayList<Contact> receiverList) {
        this.receiverList = receiverList;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
    @Override
    public String toString(){
        return "\n"+this.receiverList.toString()+"\n"+this.message.toString();
    }
}
