class SumLastDigits{
public static void main(String args[]){
	int no1 = -267;
	int no2 = 267;
	int sum = Math.abs(no1%10)+Math.abs(no2%10);
	System.out.println("numbers are "+no1+", "+no2+" and their last digit sum is: "+sum);
	}
}