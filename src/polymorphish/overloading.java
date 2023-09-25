package polymorphish;

public class overloading {
	public static void main(String[] args) {
	
   overloading  a2 = new overloading();
        a2.add();
        a2.add(1, 2, 3, 4, 5, 6);
		
	}
	
	
	public void add () {
		System.out.println("addition possible in calculator");
	}
	
	public void add (int a, int b) {
		System.out.println("addition possible in calculator"+ a+b);
	}
	
	public void add (int a, int b, int c) {
		System.out.println("addition possible in calculator"+ a+b+c);
	}
	
	public void add (int a, int b, int c, int d) {
		System.out.println("addition possible in calculator"+ a+b+c+d);
	}
	
	public void add (int a, int b, int c, int d, int e) {
		System.out.println("addition possible in calculator"+ a+b+c+d+e);
	}	
	
	public void add (int a, int b, int c, int d, int e,int f) {
		System.out.println("addition possible in calculator"+ a+b+c+d+e+f);
	}
	
}
