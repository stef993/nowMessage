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
public class LocalUser {
    
    private static LocalUser database;
    
    private String name;
    private String surname;
    private String email;
    private String password;
    private Image photo;
    private ArrayList<Contact> contactList;
    private ArrayList<Group> groupList;
    private ArrayList<Media> mediaList;

    //constructor
    public LocalUser(String name, String surname, String email, String password, Image photo) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.photo = photo;
    }

    public LocalUser(String name, String surname, String email, String password, Image photo, 
            ArrayList<Contact> contactList, ArrayList<Group> groupList, ArrayList<Media> mediaList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.contactList = contactList;
        this.groupList = groupList;
        this.mediaList = mediaList;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(ArrayList<Media> mediaList) {
        this.mediaList = mediaList;
    }
    
       
    
}
