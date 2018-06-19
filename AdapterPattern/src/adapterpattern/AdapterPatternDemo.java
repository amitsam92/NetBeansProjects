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
public class AdapterPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", null);
        player.play("mp4", null);
        player.play("vlc", null);
    }
    
}
