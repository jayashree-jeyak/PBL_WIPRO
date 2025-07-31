/*//Activity 3:
Design an algorithm that reads a list of 5 numbers (both positive and negative)
 and makes a count of the number of negative and non-negative numbers in the list.
Note: 0 must be considered as a positive number in this algorithm.
*/
import java.util.Scanner;
class a3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("THE NUMBER OF POSITIVE ELEMENTS ARE: "+pos);
        System.out.println("THE NUMBER OF NEGATIVE ELEMENTS ARE: "+neg);
    }
}
