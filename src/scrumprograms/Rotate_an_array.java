package scrumprograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import io.cucumber.java.sl.In;

public class Rotate_an_array {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5,6};//512345
	//	System.out.println(arr[arr.length-1-4]);
		ArrayList<Integer> list=new ArrayList<>();
		//System.out.println(arr.length-1);
		list.add(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
		    list.add(arr.length-1-i);
		}
		System.out.println(list);
		
		
		
		
	}

}
