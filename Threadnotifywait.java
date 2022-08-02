package phase1.mphasis;

class costomer12
{
	int amount =10000;
	synchronized void withdraw(int amount)
	{
		if(this.amount<amount)
		{  
		//System.out.println("Less balance; waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed... balacnce:"+ this.amount);  
	}



	synchronized void deposit(int amount){  
		//System.out.println("going to deposit...");  
		this.amount+=amount;  
		
		System.out.println("deposit completed... balance : " + this.amount);  
		notify();  //unlocking of thread
	}  


}

public class Threadnotifywait {
	public static void main(String[] args) 
	{
final costomer12 c=new costomer12();  
		
		new Thread(){                 // anonymous class
		  public void run()
		  {
			c.withdraw(5000);
		  }  
		}.start();  
		
		new Thread(){                 // anonymous class
			  public void run()
			  {
				c.withdraw(4000);
			  }  
			}.start();  
			
		new Thread(){                 // anonymous class
				  public void run()
				  {
					c.withdraw(10000);
				  }  
				}.start();  
				
	

		
		new Thread(){  
		  public void run()
		   {
			 c.deposit(20000);
		   }  
		}.start();    
	}

}
