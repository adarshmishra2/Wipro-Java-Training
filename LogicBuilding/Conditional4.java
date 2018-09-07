import java.util.*;
class Conditional4{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();
	int sum = no1 + no2;
	if(sum %2 == 0){
		System.out.println(sum+" is a even number.");
	}
	else{
		System.out.println(sum+" is a odd number.");
	}
}
}