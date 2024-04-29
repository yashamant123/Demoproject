package scrumprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Firstlatter {
	public static void test1(String str) {
		String[] s=str.split(" ");
		String f="";
		for(int i=0;i<s.length;i++) {
			f+=s[i].charAt(0);
		}
		System.out.println(f);
		
	}
	public static void main(String[] args) {
		String s1 = "Geeks for Geeks";
        String s2 = "A Computer Science Portal for Geeks";
        test1(s1);
      //  Pattern p = Pattern.compile("\\b[a-zA-Z]");
       
         
       // Matcher m1 = p.matcher(s1);
//        Matcher m2 = p.matcher(s2);
//        while(m1.find()){
//        	System.out.print(s1.substring(m1.start(),m1.end()));
//        }
        
        
//         
//        System.out.println("First letter of each word from string \"" + s1 + "\" : ");
//        while (m1.find())
//            System.out.print(m1.group());
//        System.out.println();
//        System.out.println("First letter of each word from string \"" + s2 + "\" : ");
//        while (m2.find()) 
//            System.out.print(m2.group());
         
         
	}

}
