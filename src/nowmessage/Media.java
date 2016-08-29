/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.io.File;

/**
 *
 * @author anto
 */
public abstract class Media {
    
    protected String name;
    protected File media;

    /**
     * Questo metodo permette di conoscere il nome del file multimediale
     * @return il nome del media
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Questo metodo permette di settare il nome del file multimediale
     * @param name indica il nuovo nome da impostare al file
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Questo metodo permette di conoscere il contenuto del media
     * @return il contenuto del media
     */
    public abstract File getContent(); 

    /**
     * Questo metodo permette di settare il file media
     */
    public abstract void setContent();

     
    
    
}
