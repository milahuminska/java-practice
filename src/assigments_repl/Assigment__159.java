package assigments_repl;

public class Assigment__159 {
	public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	   if (buyPrice<sellPrice ){
	     return "profit";
	     
	   }else if (buyPrice>sellPrice ){
		     return "loss";
	   }else if (buyPrice==sellPrice ){
		     return "no loss";     
		
	   
	  }
	return null;

	  }
}
