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
public class ColorFactory extends AbstractFactory{
    public Color getColor(String color){
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("green")){
            return new Green();
        }else{
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
