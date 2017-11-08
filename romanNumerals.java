import java.util.Scanner;
public class romanNumerals {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = in.nextInt();
	romanNum(num);
}
public static void romanNum(int num){
	int num100s = num/100;  //2
	int num50s = (num - 100*num100s)/50; //1
	int num10s = ((num - 100*num100s)-50*num50s)/10;  //2
	int num5s = (((num - 100*num100s)-50*num50s) - 10*num10s)/5;
	//System.out.print(num5s);
	int num1s = ((((num - 100*num100s)-50*num50s) - 10*num10s))-5*num5s;    //1
	//System.out.print(num1s);
	for (int x = 0; x<num100s; x++){
		System.out.print("C");
	}
	for (int l = 0; l<num50s; l++){
		System.out.print("L");
	}
	for (int i = 0; i<num10s; i++){
		System.out.print("X");
	}
	for (int k = 0; k<num5s; k++){
		System.out.print("V");
	}
	for (int j = 0; j<num1s; j++){
		if (num1s == 4){
			System.out.print("IV");
			j = 4;
		}else{
			System.out.print("I");
		}
	}
	
}
}
