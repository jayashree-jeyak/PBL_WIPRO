// Design an algorithm which accepts a decimal integer and then displays its corresponding binary representation.
import java.util.Scanner;
class a3{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int temp=0;
     String bi=" ";
     if(n==0){
        System.out.println("0");
        return;
     }
     while(n>0){
        temp=n%2;
        bi=temp+bi;
        n=n/2;
     }
     System.out.println(bi);

    }
}