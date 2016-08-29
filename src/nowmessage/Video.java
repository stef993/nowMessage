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
    
    /**
     * Constructor
     * @param name indica il nome del video da creare
     * @param height indica l'altezza del video da creare
     * @param width indica la larghezza del video da creare
     * @param length indica la durata del video
     */
    public Video(String name, Double height, Double width, String length){
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //methods
    
    /**
     * Questo metodo permette di conoscere il contenuto del video
     * @return il contenuto del video
     */
    @Override
    public File getContent() {
        return this.media;
    }
    
    /**
     * Questo metodo permette di settare il video
     */
    @Override
    public void setContent(){
        
    }
    
    /**
     * Questo metodo permette di avere una rappresentazione testuale dell'oggetto Video
     * @return la stringa associata
     */
    @Override
    public String toString(){
        return "\nTipo: Video"
                + "\nNome: " + name
                + "\nAltezza: " + height
                + "\nLarghezza: " + width
                + "\nDurata: " + length;
    }
}
