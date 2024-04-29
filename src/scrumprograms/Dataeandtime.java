package scrumprograms;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Dataeandtime {
public static	int[] solution(int[] numbers) {
		int arr[] ={};
		int j=0;
		for(int i=0;i<numbers.length-1;i++){
		        if(((numbers[i]<(numbers[i+1]))&&(numbers[i+1]>numbers[i+2])) 
		        		&& ((numbers[i]>numbers[i+1])&&(numbers[i+1]<numbers[i+2]))){
		            arr[j]=1;
		            j++;
		       }
		    else{
		       arr[j]=0; 
		       j++;
		    }
		}
		return arr;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   Date d1= new Date();
//		   String date= d1.toString();
//		   System.out.println(date);
//		   String[] date1=date.split(" ");
//		   System.out.println(date1[0]);
		
		
//		   String dayNames[] = new DateFormatSymbols().getWeekdays();
//		   Calendar date = Calendar.getInstance(); 
//		   System.out.println(date.getTime());
//		   System.out.println(dayNames[date.get(Calendar.DAY_OF_WEEK)]);
		   
	   
//// last day of calendar   
//		  Calendar cal=Calendar.getInstance();
//		  cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		  System.out.println(cal.getTime());
//		  String lastday=cal.getTime().toString();
//		  String[] lastday1=lastday.split(" ");
//		  System.out.println("last day of the month"+" "+lastday1[0]);
		
	//last day of current week	
//		  Calendar cal1=Calendar.getInstance();
//		  cal1.set(Calendar.DAY_OF_WEEK,cal1.getActualMaximum(Calendar.DAY_OF_WEEK));
//		  System.out.println(cal1.getTime());
//		   String str1=cal1.getTime().toString();
//		   String[] str2=str1.split(" ");
//		   System.out.println(str2[0]);
//		  Calendar cal2=Calendar.getInstance();
//		  cal2.set(Calendar.DAY_OF_WEEK,cal2.getActualMinimum(Calendar.DAY_OF_WEEK));
//		  System.out.println(cal2.getTime());
//		  String str6=cal2.getTime().toString();
//		  String[] str7=str6.split(" ");
//		  System.out.println(str7[0]);
		
////Remaining month in a year
//		LocalDate t = LocalDate.now(); 
//		LocalDate lastDayOfYear = t.with(TemporalAdjusters.lastDayOfYear());
//		System.out.println(lastDayOfYear);
//		Period period = t.until(lastDayOfYear);
//		System.out.println("Months Remaining in the Year : "+period.getMonths());
		
		
		int arr[]= {1,2,1,3,4};
		System.out.println(solution(arr));
		
		
		
		
		  
		  

	}

}
