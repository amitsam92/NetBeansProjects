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
public class Circle extends Shape{
    int r;
    public Circle(int r, DrawAPI drawAPI){
        super(drawAPI);
        this.r = r;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(r);
    }
    
}
