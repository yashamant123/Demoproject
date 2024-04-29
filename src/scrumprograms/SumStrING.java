package scrumprograms;

public class SumStrING {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc123def45gh6i7&quot";
		String s1=s.replaceAll("[^A-za-z0-9]","");
		String[] s3=s1.split("[A-Za-z]");
		int sum=0;
		for(int i=0;i<s3.length;i++) {
			if(s3[i]!="") {
		sum=sum+Integer.parseInt(s3[i]);
			}
		}
    System.out.println(sum);
	}

}
