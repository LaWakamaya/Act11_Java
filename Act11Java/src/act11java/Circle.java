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
public class Circle extends Shape{
    
    double radio = 0;
    
    public Circle(double radio){
        this.radio = radio;
    }
    
    public void getPerimetro(){
        double perimetro = (radio * 2) * Math.PI;
        System.out.println("El perimetro del circulo es de " + perimetro);
    }
    
    public void getArea(){
        double area = Math.PI * (radio * radio);
        System.out.println("El area del circulo es de " + area);
    }
}
