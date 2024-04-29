package scrumprograms;

public class Greatestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20,c=5;
		if(a>b && b>c) {
			System.out.println("the greatest value is"+" "+a);
		}
		else if(b>a && a>c) {
			System.out.println("the greatest value is"+" "+b);
		}
		else {
			System.out.println("the greatest value is"+" "+c);
		}	
	}

}
