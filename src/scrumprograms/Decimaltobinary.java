package scrumprograms;

import java.util.Base64;

public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str= Base64.getEncoder().encodeToString("yashamant1".getBytes());
         System.out.println(str);
         String decode=new String(Base64.getDecoder().decode(str.getBytes()));
         System.out.println(decode);
        	 
         }
	}


