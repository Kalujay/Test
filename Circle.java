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

 
    public class Circle {  //save as "Circle.java"
        //private instance variable, not accesible from outside this class
        private double radius;
        private String color;
        //1st constructor, which sets both radius and color to default
        public Circle(){
            radius = 1.0;
           color = "red";
        }
        //2nd contructor with given radius, but color default 
        public Circle(double r){
            radius = r;
            color = "red";
        }
        //a public method for retrieving the radius
        public double getRadius(){
            return radius;
        
        }
        //a public method for computing the area of circle
        public double getArea(){
            return radius*radius*Math.PI;
        }
    }


