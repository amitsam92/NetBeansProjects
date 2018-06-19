/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatternshapedemo;

/**
 *
 * @author samdarshi
 */
public class FactoryPatternShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape a = sf.getShape("circle");
        Shape b = sf.getShape("rectangle");
        Shape c = sf.getShape("square");
        a.draw();
        b.draw();
        c.draw();
    }
    
}
