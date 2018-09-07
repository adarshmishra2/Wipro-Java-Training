import java.util.*;
class Loop2{
public static void main(String args[]){
	for(int i=1; i<=100; i=i+2){
		if(i > 1){
		System.out.print(", ");
		}
		System.out.print(i);
	}
}
}