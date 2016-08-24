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
    
    //costructor
    public Audio(String name, String length){
        this.name = name;
        this.length = length;
    }

    //override Media methods
    public File getContent() {
        return this.media;
    }
    
    public void setContent(){
        
    }
}
