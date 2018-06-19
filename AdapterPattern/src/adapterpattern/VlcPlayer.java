/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author samdarshi
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName){
        System.out.println("playing vlc");
    }
    public void playMp4(String fileName){
    }
}
