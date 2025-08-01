//Activity 1:
 //Design an algorithm to accept 10 integer elements for an array and print the sum of all the elements.
 import java.util.Scanner;
class a1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}