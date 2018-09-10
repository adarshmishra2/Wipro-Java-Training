import java.io.*;
import  java.util.*;

// Read only region start
class WeightOfString
{

	public int weightOfString(String input1,int input2){
		// Read only region end
		// Write code here...
		String str=input1;
		str = str.replaceAll("[^a-zA-Z\\s+]", "");
        String[] sArray=sarr.toLowerCase().split(" ");
		String s = "";
		for(String n:sArray)
            s+= n;
            char[] c = s.toCharArray();
        
		int[] arr=new int[c.length];
        for(int i=0; i < c.length; i++) {
			arr[i] = (int) c[i]-'a'+1;
		}
        int sum=0;
        for(int i=0; i < arr.length; i++){
            sum=sum+arr[i];
        }
        if(input2==0){
			for(int i=0; i<arr.length;i++){
              if(arr[i]==1 ||arr[i]==5 || arr[i]==9 || arr[i]==15 || arr[i]==21){
                sum=sum-arr[i];
            }
         }
		}
        return sum;
	}
}