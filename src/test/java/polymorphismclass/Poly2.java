package polymorphismclass;

public class Poly2 extends Poly1 implements Polyinterface,Polyinterface2{

	public static void main(String[] args) {
		Poly2 obj=new Poly2();
		
		obj.fbsignin("tanha@gmail", "a123", 654232);
		obj.fbsignin(654232, "a123");
		obj.fbsignin("tanha@gmail", "a123");
		
		obj.googlelognin();
		obj.googlesignin();
		obj.googlesingup();
		

	obj.Fbsignin("ab@gmail", "a456");
	obj.Fbsignin("ab@gamil", "a456", "tanha");
	obj.Fbsignup();
	
	obj.yahoosignin("ab@yahoo", "c123");
	obj.yahoosignin("ab@yahoo", "c123", "Tanha");
	obj.yahoosignup();
		
	}

	public void yahoosignin(String email, String pw) {
		System.out.println("yahoosignin successfully"+" "+email+" "+pw);
		}

	public void yahoosignin(String email, String pw, String name) {
	   System.out.println("yahoosignin successfully"+" "+email+" "+pw+" "+name);	
	}

	public void yahoosignup() {
	  System.out.println("yahoosignup successfully");	
	}

	public void Fbsignin(String email, String pw) {
		System.out.println("Fbsignin successfully"+" "+email+" "+pw);
	}

	public void Fbsignin(String email, String pw, String name) {
		System.out.println("Fbsignin successfully"+" "+email+" "+pw+" "+name);
	}

	public void Fbsignup() {
		System.out.println("Fbsignin successfully");
	}

}
