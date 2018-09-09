import java.util.*;
class NoOfPrimes{
public static void main(String args[]){
	int inp1=2;
	int inp2=20;
	int count;
	List<Integer> primes=new ArrayList<>();
	for(int i=inp1;i<=inp2;i++){
		count=0;
		for(int j=2;j<i;j++){
			if(i%j==0){
				count++;
				break;
			}
		}
		if(count==0){
			primes.add(i);
		}
	}
	System.out.println(primes.size());
}
}