package thread.creation;

public class Thread_Creation extends Thread {
	public void run(){
		System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());    
		System.out.println("running thread name is:"+Thread.currentThread().getName()); 
		System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
	    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
	}

	
	public static void main(String args[]){  
		  
		  Thread_Creation m1=new Thread_Creation();  
		  Thread_Creation m2=new Thread_Creation();
		  Thread_Creation m3=new Thread_Creation();
		  
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		  
		  m1.setPriority(Thread.MAX_PRIORITY);  
		  m2.setPriority(Thread.NORM_PRIORITY);  
		  m3.setPriority(Thread.MIN_PRIORITY); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
	}
}

