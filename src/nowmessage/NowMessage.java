/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

/**
 *
 * @author anto
 */
public class NowMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerCommunicationSystem server=ServerCommunicationSystem.getInstance();
        LocalUser lu=server.getLocalUser();
        System.out.println(lu.getGroupList().toString());
    }
    
}
