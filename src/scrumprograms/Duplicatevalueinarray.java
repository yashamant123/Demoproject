package scrumprograms;

import java.util.ArrayList;
import java.util.HashMap;

public class Duplicatevalueinarray {

	public static void main(String[] args) {
		String[] arr = {"srikar","jayesh","kavita","Hyderabad","Tirumala","Banglore","Hyderabad","debrati","ankita","jayesh","pune","GRhombus Technologies","Noida","kavita","Telangana","Delhi","Karnataka","Maharashtra","india"};
	HashMap<String, Integer> map= new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"="+map.get(arr[i])+",");
	}
	
	ArrayList<String> list=new ArrayList<>();
	
	
	}
}
