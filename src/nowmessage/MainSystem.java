/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author Mrk
 */
public class MainSystem {
    
    private static MainSystem mainController;
    
    private final ContactSystem contactController = ContactSystem.getInstance();
    private final GroupSystem groupController = GroupSystem.getInstance();
    private final MessageSystem msgController = MessageSystem.getInstance();
    
    private final MainViewer mainView = new MainViewer();
    
    /**
     * Costructor
     */
    private MainSystem (){
        
    }
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata
     * @return l'istanza del controller
     */
    public static MainSystem getInstance(){
        if(MainSystem.mainController == null){
            MainSystem.mainController = new MainSystem();
        }
        return MainSystem.mainController;
    }
    
    /**
     * Questo metodo permette di lanciare l'esecuzione del programma
     */
    public void startSystem(){
        
        Integer input = mainView.showFunction();
        
        switch(input){
            case 1: //RICHIAMA CONTROLLER CONTATTI PER STAMPARNE LA LISTA E LE OPZIONI DI GESTIONE;
                    break;
            case 2: //RICHIAMA CONTROLLER GRUPPI PER STAMPARNE LA LISTA E LE OPZIONI DI GESTIONE;
                    break;
            case 3: //RICHIAMA CONTROLLER MESSAGGI PER CREARNE E POI INVIARNE UNO;
                    break;
            case 0: System.out.println("Esci");
                    break;
        }
    }
}
