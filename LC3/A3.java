//Activity 3:
 //Design an algorithm to accept 10 integer elements for an array and then 
 //rearrange the elements in the array in reverse order. The reversed array must be displayed as output.
import java.util.Scanner;
class a3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
         arr[i]=sc.nextInt();
        }
      //  int[] arr1=new int[10];
      System.out.print("[ ");
        for(int i=arr.length-1;i>=0;i--){
             System.out.print(arr[i]+" ");
        }
        System.out.print(" ] ");
    }
}