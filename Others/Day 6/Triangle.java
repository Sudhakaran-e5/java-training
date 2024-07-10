/*
 * This java file is a Demo Java program which depicts 
 * how to create a subclass of an abstract class.
 */


public class Triangle extends Shape {
   private float triangleArea;
   public void area() {
       triangleArea = (float) 0.5* getLength() * getBreadth();
  }
   public void display() {
        System.out.println("Base : "+ getLength());
        System.out.println("Height : "+ getBreadth());
        System.out.println("Area of triangle : "+ triangleArea);
  }
}
