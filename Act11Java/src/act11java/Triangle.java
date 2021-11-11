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
public class Triangle extends Shape{
    
    double base = 0;
    double altura = 0;
    
    public Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void getPerimetro(){
        double perimetro = base * 3;
        System.out.println("El perimetro del triangulo es de " + perimetro);
    }
    
    public void getArea(){
        double area = base * altura / 2;
        System.out.println("El area del triangulo es de " + area);
    }
}
