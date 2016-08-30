/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Mrk
 */
public class GroupViewer {
    
    /**
     * Questo metodo permette di mostrare all'utente un gruppo
     * @param group indica il gruppo da mostrare
     */
    public void showGroup(Group group){
        System.out.println(group);
    }
    
    /**
     * Questo metodo permette di mostrare all'utente la propria lista gruppi
     * @param list indica la lista gruppi da mostrare
     */
    public void showGroupList(ArrayList<Group> list){
        int num=1;
        System.out.println("\n**Gruppi**");
        for(Group group : list) {
            System.out.print("n. "+num+" ");
            num+=1;
            showGroup(group);
        }
    }
    
}
