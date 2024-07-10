public class ConcurrentExample extends Thread {
  private static int amount = 0;

  public static void main(String[] args) {
    ConcurrentExample thread = new ConcurrentExample();
    System.out.println("Initial amount is:"+amount);    
    
    thread.start();
  
    amount++;
	
    System.out.println("Final amount is:"+amount);
  }

  public void run() {
	try{
		sleep(100);
    		amount++;
		System.out.println("Amount in run() :"+amount);
	}catch(Exception e){
		e.printStackTrace();
	}
  }
}
/*
while(thread.isAlive()) {
      //System.out.println("Waiting...");
    }
	try{
		thread.join();
	}catch(Exception e){e.printStackTrace();}
*/