//Design an algorithm that reads a number from the user and tells if it is even or odd or a zero.
import java.util.Scanner;
class a4{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     if(a==0){
        System.out.println("zero");
        return;
     }
     if(a%2==0){
        System.out.println("even");
     }   
   
     else{
        System.out.println("odd");
     }
    }
}