package scrumprograms;

import java.util.HashMap;
import java.util.Map;

public class Occurrences_string {
	public static void occurrence(String str,Character ch) {
		HashMap<Character, Integer>  map=new HashMap<>();
        for(int i=0;i<
        		str.length();i++) {
        	map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        
        for (Map.Entry<Character,Integer> entry : map.entrySet()) //using map.entrySet() for iteration  
        {  
        	if(entry.getKey()== ch) {
        	  System.out.println(entry.getKey()+"="+" "+entry.getValue());
        		
        	}  
        }   	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str="Java is java again java again";
//        Character  ch='g';
//        
//       occurrence(str, ch);
		
		
		
//		int count=0;
//		int n=-342;
//		String s1="";
//		String s=Integer.toString(n);
//		for(int i=0;i<s.length();i++) {
//			if(Character.isDigit(s.charAt(i))) {
//			s1=s1+s.charAt(i);
//			}
//		}
//		System.out.println(s1.length());
		
		String s2="I Am Not String";
       String s3="";
        String s4="";
        for(int i=s2.length()-1;i>=0;i--) {
        	if(s2.charAt(i)!=' ') {
        	s3+=s2.charAt(i);
        	}
        }
        //System.out.println(s3);
        int size=0;
        for(int i=0;i<s2.length();i++) {
        	if(s2.charAt(i)==' ') {
        		s4+=' ';
        	}else {
        	s4+=s3.charAt(size);
        	size++;
        	}
        }
        System.out.println(s4);    		
		
	}

}
