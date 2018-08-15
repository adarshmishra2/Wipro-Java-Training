/* Get code through strings in java

Explanation:

if the input string is 'hello worlds', output will be 2.

Length of the word "hello" = 5

Length of the word "worlds" = 6

add their length to get total length = 5+6 = 11

which is not a single digit, so continuously add all digits till we get single digit i.e. 1+1=2 Therefore, the single digit is = 2 (as answer/output).
*/


import java.util.*;
class getcodestring{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String word=sc.nextLine();
String strsplits[] = word.split(" ");
int length=0;
for(String strtmp : strsplits){
System.out.println("word: "+strtmp+", Length: "+strtmp.length());
length = length + strtmp.length();
}
System.out.println("Total words: "+strsplits.length);
System.out.println();
System.out.println("Added length: "+reduce(length));
}
public static long reduce(long length){
while(length > 9){
System.out.println("Initial length: "+length);
long y=0;
y = y+ (length%10+length/10%10);
length = length/10;
length=y;
}
return length;

}
}
