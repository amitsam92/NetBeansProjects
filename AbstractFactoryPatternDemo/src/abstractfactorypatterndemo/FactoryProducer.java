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
public class FactoryProducer {
    public AbstractFactory getFactory(String factory){
        if(factory == null){
            return null;
        }else if(factory.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(factory.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
