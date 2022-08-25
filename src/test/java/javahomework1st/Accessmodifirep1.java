package javahomework1st;

public class Accessmodifirep1 {
//Attribute with different access modifier
	public int num1=100;
	       int num2=200;
	private int num3=300;
	
	public String flower1="rose";
	       String flower2="lili";
	private String flower3="black rose";       
	
	public static void main(String[] args) {
    // create an object
		 Accessmodifirep1 myobj=new  Accessmodifirep1 ();
		 
		 System.out.println(myobj.num1);
		 System.out.println(myobj.num2);
		 System.out.println(myobj.num3);
		 System.out.println(myobj.flower1);
		 System.out.println(myobj.flower2);
		 System.out.println(myobj.flower3);
		
		
	}

}
