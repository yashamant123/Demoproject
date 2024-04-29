package scrumprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Reversepyramid {
	public static String rotateString(String str,int num) {
		String str1=str.substring(str.length()-num)+str.substring(0,str.length()-num);
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=11;
//       for(int i=0;i<n;i++) {
//    	   for (int k=0; k<=i; k++)
//    	      {
//    	        System.out.print(" ");
//    	      }
//    	   for (int j=0; j<=n-1-i; j++)
//    	      {
//    	        System.out.print("* ");
//    	      }
//    	      System.out.println(); 
//    	  
//       }
		
		
//        char c='p';
//        System.out.println(Collections.frequency(Arrays.asList(str.split("")),String.valueOf(c)));  
		//System.out.println(str.substring(str.length()-1)+str.substring(0,str.length()-2));
         String str="herrypotter";
         HashMap<Character, Integer> map=new HashMap<>();
         for(int i=0;i<str.length();i++) {
        	 map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
         }
		
         List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

         // Sort the list by values
         Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

         // Create a new LinkedHashMap to maintain the order
         Map<Character, Integer> sortedMap = new LinkedHashMap<>();
         for (Map.Entry<Character, Integer> entry : entryList) {
             sortedMap.put(entry.getKey(), entry.getValue());
         }
		
         System.out.println(sortedMap.size());
	}
}
