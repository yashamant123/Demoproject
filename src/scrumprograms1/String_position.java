package scrumprograms1;

import java.util.HashMap;



public class String_position {
	public static void position(char ch,String str) {
		System.out.println(ch+" "+"position"+" "+(str.indexOf(ch)+1));
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      String str="Automation%Selenium$Practice#";
//      String s1=str.replaceAll("[A-za-z0-9]","");
//		for(int i=0;i<s1.length();i++) {
//			position(s1.charAt(i), str);
//		}
		
		String str="Content-Type:multipart/form-data; boundary=<calculated when request is sent>;Authorization:";
		String[] str1=str.split(";");
		String temp=str1[0].split(":")[1].trim();
		System.out.println(temp);
//       HashMap<String, String> map=new HashMap<>();
//		for(int i=0;i<str1.length;i++) {
//			String temp=str1[i].split(":")[0].trim();
//			if(temp.equals("Authorization")) {
//				map.put(temp, "122455");
//			}else {
//		map.put(temp, str1[i].split(":")[1].trim());
//			}
//		} 
//		
//		System.out.println(map);
 
	}

}
