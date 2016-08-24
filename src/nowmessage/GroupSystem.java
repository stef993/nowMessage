/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author Mrk
 * Classe che fungerà da controllore per la gestione dei gruppi.
 * Sara' una classe singleton, in modo da avere un unico controller per i
 * gruppi all'interno del programma
 */
public class GroupSystem {
    
    private static GroupSystem groupController;
    //indica una istanza della stessa classe GroupSystem
    
    /**
     * Constructor
     */
    private GroupSystem() {
        
    }
    
    //methods
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata.
     * @return l'istanza del controller
     */
    public static GroupSystem getIstance(){
        if (GroupSystem.groupController == null){
            GroupSystem.groupController = new GroupSystem();
        }
        return GroupSystem.groupController;
    }
}
