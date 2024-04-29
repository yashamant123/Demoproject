package onlinecode;

public class Merge_string {
	public static String merge_String(String word1,String word2) {
		String result="";
		if(word1.length()<word2.length()) {
			for(int i=0;i<word1.length();i++) {
				result+=word1.charAt(i)+""+word2.charAt(i);
			}
			result+=word2.substring(word1.length(),word2.length());
		}
		if(word1.length()>word2.length()) {
			for(int i=0;i<word2.length();i++) {
				result+=word1.charAt(i)+""+word2.charAt(i);
			}
			result+=word1.substring(word2.length(),word1.length());
		}
		if(word1.length()==word2.length()) {
			for(int i=0;i<word2.length();i++) {
				result+=word1.charAt(i)+""+word2.charAt(i);
			}
		}
		return result;
	}

	
	
	public static void main(String[] args) {
		String word1="ABCABC";
		String word2="ABC";
		String result="";
      for(int i=0;i<word1.length();i++) {
    	  for(int j=0;j<word2.length();j++) {
    		  if((word1.charAt(i)==word2.charAt(j))) {
    			  result+=word1.charAt(j);
    			  break;
    		  }
    		  break;
    	  }
      }
      System.out.println(result);
		
	}

}
