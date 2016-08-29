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

    /**
     * Constructor
     */
    private LocalUser(){
        //BISOGNEREBBE CREARE UN METODO LOAD CHE SIMULI IL CARICAMENTO DAL DB SERVER DEI DATI UTENTE
    }
    
    /*public LocalUser(String name, String surname, String email, String password, Image photo) {
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
    }*/

    //methods
    
    /**
     * Questo metodo permette di creare l'istanza del database qualora non sia già stata creata
     * @return l'istanza del database
     */
    public static LocalUser getInstance(){
        if(LocalUser.database == null){
            LocalUser.database = new LocalUser();
        }
        return LocalUser.database;
    }
    
    /**
     * Questo metodo permette di conoscere il nome dell'utente corrente
     * @return il nome utente
     */
    public String getName() {
        return name;
    }
    
    /**
     * Questo metodo permette di settare il nome utente
     * @param name indica il nuovo nome utente che si vuole impostare
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Questo metodo permette di conoscere il cognome dell'utente corrente
     * @return il cognome dell'utente
     */
    public String getSurname() {
        return surname;
    }
    
    /**
     * Questo metodo permette di settare il cognome dell'utente
     * @param surname indica il nuovo cognome utente da impostare
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Questo metodo permette di conoscere l'email dell'utente
     * @return l'email utente
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Questo metodo permette di settare l'email dell'utente
     * @param email indica la nuova email da impostare
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Questo metodo permette di conoscere la password dell'utente
     * @return la password dell'utente
     */
    public String getPassword() {
        return password;
    }

    /**
     * Questo metodo permette di settare la password utente
     * @param password indica la nuova password da impostare
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Questo metodo permette di conoscere la foto del profilo dell'utente corrente
     * @return la foto del profilo dell'utente
     */
    public Image getPhoto(){
        return this.photo;
    }
    
    /**
     * Questo metodo permette di settare la foto del profilo dell'utente
     * @param photo indica la nuova foto del profilo utente
     */
    public void setPhoto(Image photo){
        this.photo = photo;
    }
    
    /**
     * Questo metodo permette di conoscere la rubrica dell'utente
     * @return la rubrica utente
     */
    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    /**
     * Questo metodo permette di settare la rubrica utente
     * @param contactList indica la nuova rubrica dell'utente da impostare
     */
    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    /**
     * Questo metodo permette di conoscere la lista dei gruppi dell'utente
     * @return la lista gruppi dell'utente
     */
    public ArrayList<Group> getGroupList() {
        return groupList;
    }

    /**
     * Questo metodo permette di settare la lista gruppi dell'utente
     * @param groupList indica la nuova lista gruppi dell'utente da impostare
     */
    public void setGroupList(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }

    /**
     * Questo metodo permette di conoscere la lista dei media dell'utente
     * @return la lista dei media dell'utente
     */
    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    /**
     * Questo metodo permette di settare la lista dei media utente
     * @param mediaList indica la nuova lista media da impostare
     */
    public void setMediaList(ArrayList<Media> mediaList) {
        this.mediaList = mediaList;
    }
    
    /**
     * Questo metodo permette di avere una rappresentazione testuale dell'oggetto LocalUser
     * @return la stringa associata
     */
    @Override
    public String toString(){
        return "\nNome: " + name
                + "\nCognome: " + surname
                + "\nEmail: " + email
                + "\nPassword: " + password
                + "\nFoto: " + photo.getName();
    }
    
}
