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
public class ContactViewer {
    
    /**
     * Questo metodo permette di mostrare all'utente un contatto
     * @param contact indica il contatto da mostrare
     */
    public void showContact(Contact contact){
        System.out.println(contact);
    }
    
    /**
     * Questo metodo permette di mostrare all'utente la propria rubrica
     * @param list indica la lista di contatti da mostrare
     */
    public void showContactList(ArrayList<Contact> list){
        int num=1;
        System.out.println("\n**Rubrica**");
        for(Contact contact : list){
            System.out.print("n. "+num+" ");
            num+=1;
            showContact(contact);
        }
        //System.out.println(list);
    }
    
}
