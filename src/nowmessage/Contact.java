/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.util.ArrayList;

/**
 *
 * @author Mrk
 */
public class Contact {
    
    private String email;
    private Image photo;
    private boolean contactBlocked = false; //di default tutti i contatti non sono bloccati
    private ArrayList<Message> messages;

    //constructor
    public Contact(String email, Image photo, ArrayList<Message> messages) {
        this.email = email;
        this.photo = photo;
        this.messages = messages;
    }

    public Contact(String email, Image photo) {
        this.email = email;
        this.photo = photo;
    }
    
    //methods
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public boolean isContactBlocked() {
        return contactBlocked;
    }

    public void setContactBlocked(boolean contactBlocked) {
        this.contactBlocked = contactBlocked;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    
    
    
    
    
}
