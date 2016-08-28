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
 * Classe che fungerà da controllore per la gestione dei contatti.
 * Sara' una classe singleton, in modo da avere un unico controller per i
 * contatti all'interno del programma
 */
public class ContactSystem {
    
    private static ContactSystem contactController;
    
    private final LocalUser user = LocalUser.getInstance();
    
    /**
     * Constructor
     */
    private ContactSystem() {
        
    }
    
    //methods
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata.
     * @return l'istanza del controller
     */
    public static ContactSystem getInstance(){
        if (ContactSystem.contactController == null){
            ContactSystem.contactController = new ContactSystem();
        }
        return ContactSystem.contactController;
    }
    
    /**
     * Questo metodo permette di aggiungere un contatto alla rubrica dell'utente
     * @param email indica l'email del contatto da aggiungere
     * @param photo indica la foto del contatto da aggiungere
     * @return la lista contatti aggiornata
     */
    public ArrayList<Contact> newContact(String email, Image photo){
        Contact newContact;
        //1- richiamerà il costruttore di Contact
        //2- aggiornerà la contactList del LocalUser
        //3- renderà la lista aggiornata dei contatti
        return null; //giusto per indicare qualcosa
    }
    
    /**
     * Questo metodo permette di rispondere ad una richiesta di aggiunta del proprio contatto nella
     * rubrica di un altro utente
     */
    public void acceptToBeAdded(){
        
    }
    
    /**
     * Questo metodo permette di rimuovere un contatto dalla rubrica
     * @param contact indica il contatto da rimuovere
     * @return la lista contatti aggiornata
     */
    public ArrayList<Contact> deleteContact(Contact contact){
        //1- si cerca il contatto nella contactList del LocalUser
        //2- lo si rimuove
        //3- si rende la lista contatti aggiornata
        return null; //giusto per indicare qualcosa
    }
    
    /**
     * Questo metodo permette di bloccare un contatto
     * @param contact indica il contatto da bloccare
     * @param inContactList serve per indicare se il blocco e' rivolto ad un contatto nella rubrica oppure
     * ad un utente non ancora aggiunto
     */
    public void blockContact(Contact contact, boolean inContactList){
        //1- se inContactList = true allora il contatto da bloccare sarà in rubrica
        //1.1- si cerca il contatto nella contactList del LocalUSer con "indexOf(Object o)" di ArrayList
        //1.2- si preleva l'elemento con il metodo get(int index)
        //1.3- si verifica che l'attributo contactBlocked sia su false
        //1.4- si rimuove il contatto dalla rubrica
        //1.5- si modifica l'attributo contactBlocked in true
        //1.6- si aggiunge il contatto all'interno della lista dei contatti bloccati
        //2- se inContactList = false allora il contatto da bloccare non è in rubrica ma da cercare sul DB
        //2.1- si cerca sul DB l'utente che abbia l'email indicata in contact (visto che è univoca)
        //2.2- lo si blocca e aggiunge alla lista dei contatti bloccati
    }
    
    /**
     * Questo metodo permette di sbloccare un contatto
     * @param contact indica il contatto da sbloccare
     */
    public void unblockContact(Contact contact){
        //1- si cerca il contatto nella lista dei contatti bloccati con "indexOf(Object o)" di ArrayList
        //2- si preleva l'elemento con il metodo get(int index)
        //3- si verifica che l'attributo contactBlocked sia su true
        //4- lo si modifica e lo si modifica quindi con false
        //4- si aggiorna il contatto all'interno della lista con il metodo "set(int index, E element)"
    }
    
    /**
     * Questo metodo permette di prelevare la lista dei contatti dal LocalUser
     * @return la lista contatti
     */
    public ArrayList<Contact> getContactList(){
        return user.getContactList(); //rende la lista contatti presente nel local user
    }
    
    
    
}
