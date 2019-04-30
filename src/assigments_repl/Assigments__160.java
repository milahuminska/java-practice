package assigments_repl;

public class Assigments__160 {
	

	public static boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	    
	     if(toBe == true || notToBe == false){
	       return true;
	     }else if (toBe == false || notToBe == true){
	       return true;
	     } else if (toBe ==true || notToBe == true){
	       return true;
	     }else if (toBe ==false || notToBe == false) {
	       return false;
	     }
		return notToBe;
	    
	  }
	
}
