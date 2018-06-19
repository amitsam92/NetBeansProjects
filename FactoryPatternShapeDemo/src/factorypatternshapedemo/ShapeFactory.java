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
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("square")){
            return new SquareBuilder().createSquare();
        }
        else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
