import java.io.*;
import  java.util.*;

// Read only region start
class MostFrequentDigit
{

	public int MostFrequentDigit(int input1,int input2,int input3,int input4){
		// Read only region end
		// Write code here...
		String num=input1+""+input2+""+input3+""+input4;
		int []frequency = new int[10];
        for(int i = 0; i < num.length(); ++i)
        {
        int digit = num.charAt(i) - '0';
        frequency[digit] ++;
        }
		int maxFrequency = 0;
        List<Integer> ad=new ArrayList<Integer>();
        for(int i = 0; i < 10; ++i){
        if(frequency[i] >= maxFrequency){
        maxFrequency = frequency[i];
        ad.add(i);
        }
        }
		Collections.sort(ad);
		int last=ad.get(ad.size()-1);
		return last;
	}
}