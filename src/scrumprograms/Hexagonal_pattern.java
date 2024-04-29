package scrumprograms;

public class Hexagonal_pattern {

	public static void main(String[] args) {
	
		  int size = 5;
	        printHexagonalPattern(size);
	    }

	    public static void printHexagonalPattern(int size) {
	        // Print the top half of the hexagon
	        for (int i = 0; i < size; i++) {
	            // Print leading spaces
	            for (int j = 0; j < size - i - 1; j++) {
	                System.out.print(" ");
	            }
	            // Print the left half of the hexagon
	            System.out.print("/");
	            for (int j = 0; j < 2 * i; j++) {
	                System.out.print(" ");
	            }
	            // Print the right half of the hexagon
	            if (i > 0) {
	                System.out.println("\\");
	            } else {
	                System.out.println();
	            }
	        }

	        // Print the bottom half of the hexagon
	        for (int i = size - 2; i >= 0; i--) {
	            // Print leading spaces
	            for (int j = 0; j < size - i - 1; j++) {
	                System.out.print(" ");
	            }
	            // Print the left half of the hexagon
	            System.out.print("\\");
	            for (int j = 0; j < 2 * i; j++) {
	                System.out.print(" ");
	            }
	            // Print the right half of the hexagon
	            if (i > 0) {
	                System.out.println("/");
	            } else {
	                System.out.println();
	            }
	        }
	    }
      
}
