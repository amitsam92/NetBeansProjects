/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

/**
 *
 * @author samdarshi
 */
public class SingletonClass {
    public static SingletonClass instance;
    private SingletonClass(){
        
    }
    public static SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }
    public void getMessage(){
        System.out.println("I am Single");
    }
}
