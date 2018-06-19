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
public class MediaAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer advancedMediaPlayer;;
    public MediaAdapter(String fileType){
        if(fileType.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else{
            advancedMediaPlayer = new Mp4Player();
        }
    }
    
    public void play(String fileType, String fileName){
        if(fileType.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else{
            advancedMediaPlayer.playMp4(fileName);
        }
    }
    
}
