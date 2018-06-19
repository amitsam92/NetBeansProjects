/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author samdarshi
 */
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else{
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
