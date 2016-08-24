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
public class Video extends Media{
    
    private Double height; //risoluzione in altezza
    private Double width; //risoluzione in larghezza
    private String length; //durata del video
    
    //costructor
    public Video(String name, Double height, Double width, String length){
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //override Media methods
    public File getContent() {
        return this.media;
    }
    
    public void setContent(){
        
    }
}
