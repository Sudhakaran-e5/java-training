/*
 * This java file is a Demo Java program which depicts 
 * how to create an abstract class.
 */



public abstract class Shape {

    private int length;
    private int breadth;

    public int getLength() {
         return length;
    }

    public int getBreadth() {
         return breadth;
    }

    public void set(int length, int breadth) {
         this.length=length;
         this.breadth=breadth;
   }
   
   public abstract void display(); //abstract method declaration
   public abstract void area();//abstract method declaration
}
