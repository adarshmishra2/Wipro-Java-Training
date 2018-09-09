import java.io.*;
import  java.util.*;

// Read only region start
class NonRepeatingDigits
{

	public int nonRepeatDigitsCount(int input1){
		// Read only region end
		// Write code here...
		int l=String.valueOf(input1).length();
		int arr[]=new int[l];
		int val = input1;
		int count=0;
		int flag=1;
		for(int i=0;i<l;i++){
			arr[i]= val%10;
			val =(int) val/10;
		}
		for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                if(i != j)
                {
                    if(arr[i] != arr[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
                count++;
                
            }
		}
		return count;
		
	}
}