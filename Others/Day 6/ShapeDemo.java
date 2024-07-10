/*
 * This java file is a Demo Java program which depicts 
 * how to use a abstract class reference for pointing to 
 * the object of the sub class.
 */


public class ShapeDemo {
   public static void main(String [] args) {
        Shape shape;
        /* 
        Following line will not compile:
        Shape=new Shape();
        */
        shape=new Rectangle();
        shape.set(5000,1000);
        shape.area();
        shape.display();
        
        shape=new Triangle();
        shape.set(2000,500);
        shape.area();
        shape.display();
  }
}
