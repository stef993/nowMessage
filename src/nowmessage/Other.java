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
    
    //costructor
    public Other(String name){
        this.name = name;
    }

    //override Media methods
    public File getContent() {
        return this.media;
    }
    
    public void setContent(){
        this.media = media;
    }
}
