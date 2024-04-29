package scrumprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Decimal_to_binary {
	public static String mergeAlternately(String word1, String word2) {
        String result="";
      for(int i=0;i<word1.length();i++){
          result+=word1.charAt(i)+""+word2.charAt(i);
      }
     return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            int number=23;
//           float value=15.67f;
//           double value4=79.89;
//           int value2=Float.floatToIntBits(value);
//           long value5=Double.doubleToLongBits(value4);
//            System.out.println(Integer.toBinaryString(number));
//            System.out.println(Integer.toBinaryString(value2));
//            System.out.println(Long.toBinaryString(value5));
		 String str="herrypotter";
		Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        int maxFrequency=Collections.max(frequencyMap.values());
        char secondLargestOccurrence = '\0';
        int secondMaxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency < maxFrequency && frequency > secondMaxFrequency ) {
                secondMaxFrequency = frequency;
                secondLargestOccurrence = entry.getKey();
            }
        }
        System.out.println(secondLargestOccurrence);
// && frequency > secondMaxFrequency
	}

}
