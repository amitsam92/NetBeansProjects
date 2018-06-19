/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatterndemo;

/**
 *
 * @author samdarshi
 */
public class BridgePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DrawAPI rd  = new RedCircle();
        DrawAPI gd  = new GreenCircle();
        Shape rs = new Circle(0, rd);
        Shape gs = new Circle(0, gd);
        rs.draw();
        gs.draw();
    }
    
}
