package scrumprograms;

public class Leapyear {
	public static void main(String[] args) {
//		int year=2000;
//		
//		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
//			System.out.println("the year"+" "+year+" "+"is a leap year");
//		}
//		else {
//			System.out.println("the year"+" "+year+" "+"is not a leap year");
//		}
		for(int i=3;i<=23;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}

}
