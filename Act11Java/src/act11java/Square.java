/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11java;

/**
 *
 * @author Alan Franco
 */
public class Square extends Shape{
    
    double lado = 0;
    
    public Square(double lado){
        this.lado = lado;
    }
    
    public void getPerimetro(){
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es de " + perimetro);
    }
    
    public void getArea(){
        double area = lado * lado;
        System.out.println("El area del cuadrado es de " + area);
    }
}
