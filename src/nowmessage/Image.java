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
    
    /**
     * Constructor
     * @param name indica il nome dell'immagine da creare
     * @param height indica l'altezza dell'immagine
     * @param width  indica la larghezza dell'immagine
     */
    public Image(String name, Double height, Double width){    
        this.name = name;
        this.height = height;
        this.width = width;
    }

    //methods
    
    /**
     * Questo metodo permette di conoscere il contenuto dell'immagine
     * @return il contenuto dell'immagine
     */
    @Override
    public File getContent() {
        return this.media;
    }
    
    /**
     * Questo metodo permette di settare l'immagine
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
        return "\nTipo: Immagine"
                + "\nNome: " + name
                + "\nAltezza: " + height
                + "\nLarghezza: " + width;
    }
    
}
