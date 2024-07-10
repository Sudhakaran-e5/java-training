// Creating a thread by extending Thread class
class Main1 extends Thread {
  public void run() {
	try{
    		System.out.println("This code is running in a thread1");
		System.out.println("Thread1: sleeping for 100 ms");
    		Thread.sleep(200);
		System.out.println("Thread1: waking up "+getState());
	}catch(InterruptedException e){
		e.printStackTrace();
	}


  }
}

// Creating a thread by implementing Runnable interface
class Main2 implements Runnable {
  public void run() {
	try{
    		System.out.println("Thread2: sleeping for 100 ms");
		Thread.sleep(100); 
		System.out.println("Thread2: after sleeping 100 ms , going back to sleep 200 ms ");
		Thread.sleep(200); 
	}catch(InterruptedException e){
		e.printStackTrace();
	}
  }
}

public class ThreadStateMain {
  public static void main(String[] args) {
	try{
    		Main1 thread1 = new Main1();
   		System.out.println("The state of thread thread1 after spawning it - "+ thread1.getState());  
    		thread1.start();
   		System.out.println("The state of thread thread1 after calling start() it - "+ thread1.getState());  

    		Main2 runnableObj = new Main2(); 
    		Thread thread2 = new Thread(runnableObj);
		System.out.println("Starting thread2");
		System.out.println("The state of thread thread1 during sleep - "+ thread1.getState());

    		thread2.start();
		System.out.println("The state of thread thread2 before calling join() - "+ thread2.getState());
		thread2.join();
		System.out.println("The final state of thread2 after calling join() - "+ thread2.getState());
		System.out.println("The final state of thread thread1  "+ thread1.getState());


	}catch(Exception e){
		e.printStackTrace();
	}
  }
  
}