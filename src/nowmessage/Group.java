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
public class Group {
    
    private String name;
    private Image photo;
    private ArrayList<Contact> contactList;
    
    //constructor
    public Group(String name, Image photo) {
        this.name = name;
        this.photo = photo;
    }

    public Group(String name, Image photo, ArrayList<Contact> contactList) {
        this.name = name;
        this.photo = photo;
        this.contactList = contactList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }
    
    
    
}
