package scrumprograms;

public class Peterson {
	public static boolean primenum(int n) {
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		return flag;
		
	}
	public static void peterson1(int n) {
		int m=n;
		int sum=0;
		while(m!=0) {
			int j=m%10;
			int sum1=1;
			for(int i=1;i<=j;i++) {
				sum1=sum1*i;
			}
			sum+=sum1;
			m=m/10;
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Peterson number");
		}else {
			System.out.println("not a Peterson number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=40;
//		int temp=2;
//		for(int i=2;i<=40;i++) {
//		if(primenum(i)==false) {
//			if(temp%2==0) {
//				System.out.println(i);
//			}
//			temp++;
//		}
//			
//		}
		
		
		peterson1(145);
	}

}
