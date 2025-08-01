/*Design an algorithm to find the sum of all the digits in a given number.
Example:
If the number entered is 12345
The output is 158*/
import java.util.Scanner;
class a2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        while(n>0){
            rev=n%10;
            sum=sum+rev;
            n=n/10;
        }
        System.out.println(sum);
    }
}