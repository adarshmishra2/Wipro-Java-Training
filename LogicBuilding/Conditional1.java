import java.util.*;
class Conditional1{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num > 0){
		System.out.println("Positive number");
	}
	else if(num < 0){
		System.out.println("Negative number");
	}
	else{
		System.out.println("Number is zero.");
	}
}
}