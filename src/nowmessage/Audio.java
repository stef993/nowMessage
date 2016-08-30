/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.io.File;

/**
 *
 * @author Mrk
 */
public class Audio extends Media {
    
    private String length; //durata dell'audio
    
    /**
     * Costructor
     * @param name indica il nome della traccia audio da creare
     * @param length indica la durata della traccia audio
     */
    public Audio(String name, String length){
        this.name = name;
        this.length = length;
    }

    //methods
    
    /**
     * Questo metodo permette di conoscere il contenuto dell'audio
     * @return il contenuto dell'audio
     */
    @Override
    public File getContent() {
        return this.media;
    }
    
    /**
     * Questo metodo permette di settare la traccia audio
     */
    @Override
    public void setContent(){
        
    }
    
    /**
     * Questo metodo permette di avere una rappresentazione testuale dell'oggetto Image
     * @return la stringa associata
     */
    @Override
    public String toString(){
        return "\nTipo: Audio"
                + "\nNome: " + name
                + "\nDurata: " + length;
    }
}
