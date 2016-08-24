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
public class Image extends Media{
    
    private Double height; //risoluzione in altezza
    private Double width; //risoluzione in larghezza
    
    //costructor
    public Image(String name, Double height, Double width){    
        this.name = name;
        this.height = height;
        this.width = width;
    }

    //override Media methods
    public File getContent() {
        return this.media;
    }
    
    public void setContent(){

    }
    
}
