// Creating a thread by extending Thread class
class Main1 extends Thread {
  public void run() {
    System.out.println("This code is running in a thread1");
  }
}

// Creating a thread by implementing Runnable interface
class Main2 implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread2");
  }
}

public class Main {
  public static void main(String[] args) {
    Main1 thread1 = new Main1();
    thread1.start();

    Main2 runnableObj = new Main2(); 
    Thread thread2 = new Thread(runnableObj);
    thread2.start();

    System.out.println("This code is outside of the thread");
  }
  
}