package scrumprograms1;

import java.util.Arrays;

public class Paragraph {
	public static void main(String[] args) {
		String[][] paragraph = {{"Good","India"},{"How","are","You?" },{"Where","are", "going"},{"I", "am", "here"}};
//	
		String[] arr= new String[paragraph.length+2];
		int index=1;
		arr[0]="****************";
		for(int i=0;i<paragraph.length;i++) {
			String str="";
			for(int j=0;j<paragraph[i].length;j++) {
				str+=paragraph[i][j]+" ";
			}
			arr[index]="*"+" "+str+"*";
			index++;
			
		}
		arr[arr.length-1]="****************";
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k].length());
		}
		
		//System.out.println(Arrays.toString(arr));
		
	}

}
