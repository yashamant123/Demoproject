package scrumprograms;

public class Sumofrowandcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int  r, c;        
	        int arr[][] = {{4, 2, 5},{9, 5, 1},{3, 5, 6}};    
	          
  System.out.println("sum of each row");
	        for(int i = 0; i < arr.length; i++){    
	            r = 0;    
	            for(int j = 0; j < arr[0].length; j++){    
	              r = r + arr[i][j];    
	            }    
	            System.out.println(r);    
	        }    
	            
	        System.out.println("sum of each column");
	        for(int i = 0; i < arr[0].length; i++){    
	            c = 0;    
	            for(int j = 0; j < arr.length; j++){    
	              c = c + arr[j][i];    
	            }    
	            System.out.println(c);    
	        }    
	}

}
