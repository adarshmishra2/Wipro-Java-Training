class SecondLastDigit{
public static void main(String args[]){
	int num = -116517;
	System.out.println("Last digit of "+num+" is: "+Math.abs(num%10));
	if(num > 9 || num < -9){
		int slast = Math.abs(((num/10)%10));
		System.out.println("Second Last digit: "+slast);
		}
	else{
		System.out.println("-1");
	}
	}
}