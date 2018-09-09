import java.io.*;
import  java.util.*;

// Read only region start
class SecondWordUpperCase
{

	public String secondWordUpperCase(String input1){
		// Read only region end
		// Write code here...
		int l=input1.length();
		String[] arr=new String[l];
		arr=input1.split(" ");
		if(arr.length<2){
			return "LESS";
		}
		String up = arr[1].toUpperCase();
		return up;
		
		
	}
}