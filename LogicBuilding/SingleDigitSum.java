import java.io.*;
import  java.util.*;

// Read only region start
class SingleDigitSum
{

	public int digitSum(int input1){
		// Read only region end
		// Write code here...
		int sum=Math.abs(input1);
		int n=0;
		 while (sum > 0 || n > 9 || n<-9)  
        { 
            if (sum == 0) { 
                sum = n; 
                n = 0; 
            } 
            n = n + sum % 10; 
            sum = sum / 10; 
        } 
		if(input1 < 0){
			n = -n;
		}
        return n; 
		
	}
}