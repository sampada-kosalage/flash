
public class PrimeNo {

	public static void main(String[] args) {
		int i,a=0;
			int flag=0;      
		  int n=3;    
		  a=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+"not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=a;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+"not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   { 
			   System.out.println(n+"prime number"); }  
		  } 
	}

}
