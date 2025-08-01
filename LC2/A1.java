/*Activity 1:
Design an algorithm to count the number of digits in a given number.
Example:
If the number entered is 12345
The output is 5 digits

If the number entered is 123
The output is 3 digits
*/
import java.util.Scanner;
class a1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=0;
        while(n>9){
            temp =n%10;
            count++;
            n=n/10;
        }
        System.out.println("THE OUTPUT IS "+(count+1)+" digits");
    }
}
