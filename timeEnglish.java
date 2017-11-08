import java.util.Scanner;
public class timeEnglish {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("What hour is it?(1-12) ");
	int hour = in.nextInt();
	System.out.println("What minute is it?(0-59) ");
	int min = in.nextInt();
	String value = getTimeName(hour, min);
	System.out.println(value);
}
public static String getTimeName(int hour, int min){
	int hour1 = hour+1;
	if (min == 0){
		return hour+" o'clock";
	}else if (min == 30){
		return "half past "+hour;
	}else if (min == 15){
		return "quarter after "+hour;
	}else if (min == 45){
		return "quarter til "+hour1;
	}else{
		return min+" minutes past"+hour;
	}
}
}
