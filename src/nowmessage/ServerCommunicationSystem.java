package nowmessage;

/**
 *
 * @author anto
 * Classe contenente tutta la logica che simula il comportamento del server
 * per poter effettuare i test dell'applicazione nowMessage
 */
public class ServerCommunicationSystem {
    
    private static ServerCommunicationSystem server;


    private ServerCommunicationSystem() {
    }
    
    
    /**
     * Questo metodo permette di creare l'istanza del controller qualora non sia già stata creata.
     * @return l'istanza del controller
     */
    public static ServerCommunicationSystem getInstance(){
        if (ServerCommunicationSystem.server == null){
            ServerCommunicationSystem.server = new ServerCommunicationSystem();
        }
        return ServerCommunicationSystem.server;
    }
    
    
    
}
