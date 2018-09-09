import java.io.*;
import  java.util.*;

// Read only region start
class EvenOddDigitsSum
{

	public int EvenOddDigitsSum(int input1,String input2){
		// Read only region end
		// Write code here...
		int l=String.valueOf(input1).length();
		int[] arr=new int[l];
		int val=input1;
		for(int i=0;i<l;i++){
			arr[i]=val%10;
			val=val/10;
		}
		int sum=0;
		if(input2.equals("even")){
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0){
					sum=sum+arr[i];
				}
			}
		}
		if(input2.equals("odd")){
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2!=0){
					sum=sum+arr[i];
				}
			}
		}
		return sum;
		
	}
}