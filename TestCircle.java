/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle.java;

/**
 *
 * @author 59378
 */
public class TestCircle {
    public static void main(String[] args) {//declare and allocate an instance of class Circle called c1

//with default radius and color
    
        Circle c1 = new Circle();
        //use the dot operator to invoke methods of instance c1.
        System.out.println("The circle has radius of" + c1.getRadius() + " and area of " + c1.getArea());
        
        //declare and allocate an instance of class circle called 
  
                //with given radius and default color
        
                Circle c2 = new Circle(2.0);
                //use the dot operator to invoke methods of instance c2.
                System.out.println("The circle has radius of" + c2.getRadius() + " and area of " + c2.getArea());
        
                Circle c3 = new Circle (3.0);
                 System.out.println("The circle has radius of" + c3.getRadius() + " and area of " + c3.getArea());
                
     
    }
    
    
}
