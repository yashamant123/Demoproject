package scrumprograms;

public class Pyramid_pattern_13_02_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int numrow=4;
		       for(int i=1;i<=numrow;i++) {
		    	   for (int k=1; k<=numrow-i; k++)
		    	      {
		    	        System.out.print(" ");
		    	      }
		    	   for (int j=1; j<=2*i-1; j++)
		    	      {
		    	        System.out.print("*");
		    	      }
		    	      System.out.println(); 
		    	  
		       }
	}

}
