package com.sdg.core.exception;

/*Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).*/

/*Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).*/

/*public class ExceptionPropogation {
	 void m(){  
		    throw new java.io.IOException("device error");//checked exception  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public static void main(String args[]){  
			  ExceptionPropogation obj=new ExceptionPropogation();  
		   obj.p();  
		   System.out.println("normal flow");  
		  }  
}

Out put-Compile Time Error*/


public class ExceptionPropogation {
	  void m(){
	   // int data=50/0;
	    throw new ArithmeticException("sorry"); 
	  }
	  void n(){
	    m();
	  }
	  void p(){
	   try{
	    n();
	   }catch(Exception e){System.out.println("exception handled");}
	  }
	  public static void main(String args[]){
	ExceptionPropogation obj=new ExceptionPropogation();
	   obj.p();
	   System.out.println("normal flow...");
	  }
}


/*Exception propogated until they are caught */