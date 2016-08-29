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
public class Other extends Media{
    
    /**
     * Constructor
     * @param name indica il nome del file 
     */
    public Other(String name){
        this.name = name;
    }
 
    //methods
    
    /**
     * Questo metodo permette di conoscere il contenuto del file
     * @return il contenuto del file
     */
    @Override
    public File getContent() {
        return this.media;
    }
    
    /**
     * Questo metodo permette di settare il file
     */
    @Override
    public void setContent(){
        this.media = media;
    }
    
    /**
     * Questo metodo permette di avere una rappresentazione testuale dell'oggetto Other
     * @return la stringa associata
     */
    @Override
    public String toString(){
        return "\nTipo: Altro"
                + "\nNome: " + name;
    }
}
