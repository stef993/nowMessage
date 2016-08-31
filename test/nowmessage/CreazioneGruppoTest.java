/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import nowmessage.*;

/**
 *
 * @author Stefano
 */
public class CreazioneGruppoTest {

    /**
     * Test di creazione di un gruppo
     */
    @Test
    public void testCreaGruppo() {
        ServerCommunicationSystem server = ServerCommunicationSystem.getInstance();
        LocalUser lu = server.getLocalUser();
        
        // verifico nome utente
        assertEquals("Mirko", lu.getName());
     
        
        // verifico i gruppi salvati al momento
        assertEquals("[\tNome: IUM-2015\tFoto: IUM-2015, \tNome: ISW-2016\tFoto: ISW-2016]", 
                lu.getGroupList().toString());
        
        
        // aggiungo un contatto alla rubrica
        Contact testContact = new Contact("contattoNuovo@test.com", new Image("Test", 800.00, 600.00));
        lu.getContactList().add(testContact);
        
        //verifico che ci sia
        assertTrue(lu.getContactList().contains(testContact));
        
        
        //creo una lista contatti
        ArrayList<Contact> contactList = new ArrayList();
        
        //inserisco 3 contatti
        contactList.add(lu.getContactList().get(0));
        contactList.add(lu.getContactList().get(3));
        contactList.add(lu.getContactList().get(6));
        
        // creo un gruppo e inserisco i 3 contatti
        Group group = new Group("gruppo_test",new Image("Immagine_gruppo_test",120.0,120.0));
        group.setContactList(contactList);
        
        // inserisco il nuovo gruppo nella lista dei gruppi
        lu.getGroupList().add(group);
        
        // verifico che il nuovo gruppo sia stato inserito correttamente
        assertEquals("\tNome: gruppo_test\tFoto: Immagine_gruppo_test",
                lu.getGroupList().get(2).toString());
        assertEquals("[	Email: infovillasimius@gmail.com     	Foto: Foto	Stato: false, 	Email: stef@live.it                  	Foto: Foto	Stato: false, 	Email: contattoNuovo@test.com        	Foto: Test	Stato: false]",
                lu.getGroupList().get(2).getContactList().toString());
        
        
        //verifico la presenza dei 3 gruppi
        assertEquals("[\tNome: IUM-2015\tFoto: IUM-2015, \tNome: ISW-2016\tFoto: ISW-2016, \tNome: gruppo_test\tFoto: Immagine_gruppo_test]",
                lu.getGroupList().toString());
    }


    
}
