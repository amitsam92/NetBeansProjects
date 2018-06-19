/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatternshapedemo;


public class SquareBuilder {

    public SquareBuilder() {
    }

    public Square createSquare() {
        return new Square();
    }
    
}
