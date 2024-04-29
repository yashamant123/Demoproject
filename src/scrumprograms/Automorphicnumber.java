package scrumprograms;

public class Automorphicnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=376;
		int square=num*num;
		String str1= Integer.toString(num);
		String str2=Integer.toString(square);
		if(str2.endsWith(str1)) {
			System.out.println("AutomorphicNumber");	
		}
		else {
			System.out.println("not an AutomorphicNumber");
		}

	}

}
