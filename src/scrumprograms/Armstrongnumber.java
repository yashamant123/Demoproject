package scrumprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 371, originalNumber, eachdigit, sum = 0;
	        originalNumber = number;
	        while (originalNumber != 0)
	        {
	        	eachdigit = originalNumber % 10;
	            sum += sum+Math.pow(eachdigit, 3);
	            originalNumber= originalNumber/10;
	        }

	        if(sum == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	

}
