package scrumprograms;

public class Happynumber {

	public static void main(String[] args) {		
		int n=49;
		int sum=0;
		if(n!=1 && n!=7) {
		for(int i=0;i<=2;i++) {
			sum=0;
		while(n!=0) {
			int eachdigit=n%10;
			sum+= Math.pow(eachdigit, 2);
			n /=10;
		}
		n=sum;
		}
		}
		if(sum==1 || n==1 || n==7) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}
	}

}
