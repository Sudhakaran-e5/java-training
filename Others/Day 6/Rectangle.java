/*
 * This java file is a Demo Java program which depicts 
 * how to create a subclass of an abstract class.
 */

public class Rectangle extends Shape {
   private int rectangleArea;
   public void area() {
       rectangleArea = getLength() * getBreadth();
  }
   public void display() {
        System.out.println("Length : "+ getLength());
        System.out.println("Breadth : "+ getBreadth());
        System.out.println("Area of rectangle : " + rectangleArea);
  }
   
}
