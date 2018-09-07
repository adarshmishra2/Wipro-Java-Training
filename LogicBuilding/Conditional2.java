import java.util.*;
class Conditional2{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	if(n1 > n2){
		System.out.println(n1+" is greater than "+n2);
	}
	else if(n1 == n2){
		System.out.println("Both are equal");
	}
	else{
		System.out.println(n2+" is greater than "+n1);	
	}
}
}