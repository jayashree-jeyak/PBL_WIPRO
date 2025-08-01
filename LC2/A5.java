/*Activity 5:
 Design an algorithm which accepts a number from the user 
 and displays its smallest exact divisor other than one
 */
import java.util.Scanner;
class a5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0){
            System.out.println(i);
            return;
          }
       }
    }
}