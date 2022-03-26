
public class Concat {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
    String var1="Sampada";
    String var2="Trainer";
    String var3=var1.concat(var2);
    var3=var3.replace("Traner","Training");
    if(var3.equals("SampadaTraning")) {
    	System.out.println("This is Training");
    	
    }else {
    	System.out.println("This is Trainer");

    }
    //System.out.println("var3");
    
	}

}
