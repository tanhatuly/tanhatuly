package polymorphismclass;

public class Poly1 {

	public void fbsignin (String email, String pw) {
		System.out.println("fbsignin successfully"+" "+email+" "+pw); //concatenation
	}
	
	public void fbsignin (String email, String pw, int phonenumber) {
		System.out.println("fbsignin1 successfully");
	}
	
	void fbsignin (int phonenumber, String pw) {
		System.out.println("fbsignin2 successfully");
	}
	
	public void fbsignin () {
		
	}
	
	
	public void googlesignin() {
		System.out.println("signin successfully");
	}
	
	protected void googlesingup() {
		System.out.println("signup successfully");
	}
	
	void googlelognin() {
		System.out.println("login successfully");
	}
	
	private void google() {
		System.out.println("google successfully");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
