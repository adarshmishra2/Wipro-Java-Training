import java.io.*;
import  java.util.*;

// Read only region start
class EvenDigitsSum
{

	public int EvenDigitsSum(int input1){
		// Read only region end
		// Write code here...
		int l=String.valueOf(input1).length();
		int val=input1;
		int[] arr=new int[l];
		for(int i=0;i<l;i++){
		    arr[i]=val%10;
			val=val/10;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
			    sum=sum+arr[i];
			}
		}
		return sum;
		
	}
}