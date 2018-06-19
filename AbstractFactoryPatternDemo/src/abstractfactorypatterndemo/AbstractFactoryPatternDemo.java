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
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryProducer fp = new FactoryProducer();
        AbstractFactory sf = fp.getFactory("shape");
        AbstractFactory cf = fp.getFactory("color");
        sf.getShape("circle").draw();
        cf.getColor("blue").fill();
    }
    
}
