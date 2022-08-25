package polymorphismclass;

public class Poly3 implements Polyinterface{

	public static void main(String[] args) {
		Poly3 obj=new Poly3();
		obj.Fbsignin("ab@gmail", "a456");
		obj.Fbsignin("ab@gmail", "a456", "tanha");
		obj.Fbsignup();

	}

	public void Fbsignin(String email, String pw) {
		System.out.println("Fbsignin successfully"+" "+email+" "+pw);
		
	}

	public void Fbsignin(String email, String pw, String name) {
		System.out.println("Fbsignin successfully"+" "+email+" "+pw+" "+name);
		
	}

	public void Fbsignup() {
		System.out.println("Fbsignup successfully");
		
	}

}
