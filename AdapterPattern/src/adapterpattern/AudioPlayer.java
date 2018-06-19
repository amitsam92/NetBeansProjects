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
public class AudioPlayer implements MediaPlayer{
    MediaAdapter adapter;
    public void play (String fileType, String fileName){
        if(fileType.equals("mp3")){
            System.out.println("playing mp3");
        }else{
            adapter = new MediaAdapter(fileType);
            adapter.play(fileType, fileName);
        }
        
    }
}
