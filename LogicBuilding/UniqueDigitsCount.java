import java.io.*;
import  java.util.*;

// Read only region start
class UniqueDigitsCount
{

	public int uniqueDigitsCount(int input1){
		// Read only region end
		// Write code here...
		int l=String.valueOf(input1).length();
		int arr[]=new int[l];
		int val = input1;
		for(int i=0;i<l;i++){
			arr[i]= val%10;
			val =(int) val/10;
		}
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
					l--;
				}
			}
		return l;
	}
}