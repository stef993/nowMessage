/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nowmessage;

import java.util.ArrayList;

/**
 *
 * @author Mrk
 */
public class MediaViewer {
    
    /**
     * Questo metodo permette di mostrare all'utente un file multimediale
     * @param media indica il media da mostrare
     */
    public void showMedia(Media media){
        System.out.println(media);
    }
    
    /**
     * Questo metodo permette di mostrare all'utente la propria lista media
     * @param list indica la lista dei media da mostrare
     */
    public void showMediaList(ArrayList<Media> list){
        System.out.println("\n**Media**");
        for(Media media : list){
            showMedia(media);
        }
    }
}
