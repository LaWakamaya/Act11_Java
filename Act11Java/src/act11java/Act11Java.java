/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Franco
 */
public class Act11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int opcion = 0;
        try{
        System.out.println("------CALCULO DE AREA O PERIMETRO------");
        System.out.println("Seleccione una figura:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        
        opcion = Integer.parseInt(br.readLine());
        }catch(Exception e){
            System.out.println("No se selecciono una opcion \nFinalizando...");
            System.exit(0);
        }
        switch(opcion){
            case 1:{
                double lado;
                System.out.println("Ingrese el valor de uno de sus lados");
                lado = Double.parseDouble(br.readLine());
                Square cuadrado = new Square(lado);
                System.out.println("Que desea obtener del cuadrado?");
                System.out.println("1. Perimetro");
                System.out.println("2. Area");
                
                opcion = Integer.parseInt(br.readLine());
                switch(opcion){
                    case 1:{
                        cuadrado.getPerimetro();
                        break;
                    }
                    case 2:{
                        cuadrado.getArea();
                        break;
                    }
                }
                break;
            }
            
            case 2:{
                double base, altura;
                System.out.println("Ingrese la base y la altura del triangulo");
                base = Double.parseDouble(br.readLine());
                altura = Double.parseDouble(br.readLine());
                Triangle triangulo = new Triangle(base, altura);
                System.out.println("Que desea obtener del triangulo?");
                System.out.println("1. Perimetro");
                System.out.println("2. Area");
                
                opcion = Integer.parseInt(br.readLine());
                switch(opcion){
                    case 1:{
                        triangulo.getPerimetro();
                        break;
                    }
                    case 2:{
                        triangulo.getArea();
                        break;
                    }
                }
                break;
            }
            
            case 3:{
                double radio;
                System.out.println("Ingrese el radio del circulo");
                radio = Double.parseDouble(br.readLine());
                Circle circulo = new Circle(radio);
                System.out.println("Que desea obtener del circulo?");
                System.out.println("1. Perimetro");
                System.out.println("2. Area");
                
                opcion = Integer.parseInt(br.readLine());
                switch(opcion){
                    case 1:{
                        circulo.getPerimetro();
                        break;
                    }
                    case 2:{
                        circulo.getArea();
                        break;
                    }
                }
                break;
            }
            
            default:{
                System.out.println("No se selecciono una opcion valida \nFinalizando...");
            }
        }
    }
    
}
